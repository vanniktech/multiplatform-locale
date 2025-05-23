Pod::Spec.new do |spec|
    spec.name                     = 'MultiplatformLocaleAll'
    spec.version                  = '0.10.0-SNAPSHOT'
    spec.homepage                 = 'https://github.com/vanniktech/multiplatform-locale'
    spec.source                   = { :http=> ''}
    spec.authors                  = 'Niklas Baudy'
    spec.license                  = 'MIT'
    spec.summary                  = 'Multiplatform Locale All for iOS, Android and JVM via Kotlin Multiplatform'
    spec.vendored_frameworks      = 'build/cocoapods/framework/multiplatform_locale_all.framework'
    spec.libraries                = 'c++'
                
                
                
    if !Dir.exist?('build/cocoapods/framework/multiplatform_locale_all.framework') || Dir.empty?('build/cocoapods/framework/multiplatform_locale_all.framework')
        raise "

        Kotlin framework 'multiplatform_locale_all' doesn't exist yet, so a proper Xcode project can't be generated.
        'pod install' should be executed after running ':generateDummyFramework' Gradle task:

            ./gradlew :multiplatform-locale-all:generateDummyFramework

        Alternatively, proper pod installation is performed during Gradle sync in the IDE (if Podfile location is set)"
    end
                
    spec.xcconfig = {
        'ENABLE_USER_SCRIPT_SANDBOXING' => 'NO',
    }
                
    spec.pod_target_xcconfig = {
        'KOTLIN_PROJECT_PATH' => ':multiplatform-locale-all',
        'PRODUCT_MODULE_NAME' => 'multiplatform_locale_all',
    }
                
    spec.script_phases = [
        {
            :name => 'Build MultiplatformLocaleAll',
            :execution_position => :before_compile,
            :shell_path => '/bin/sh',
            :script => <<-SCRIPT
                if [ "YES" = "$OVERRIDE_KOTLIN_BUILD_IDE_SUPPORTED" ]; then
                  echo "Skipping Gradle build task invocation due to OVERRIDE_KOTLIN_BUILD_IDE_SUPPORTED environment variable set to \"YES\""
                  exit 0
                fi
                set -ev
                REPO_ROOT="$PODS_TARGET_SRCROOT"
                "$REPO_ROOT/../gradlew" -p "$REPO_ROOT" $KOTLIN_PROJECT_PATH:syncFramework \
                    -Pkotlin.native.cocoapods.platform=$PLATFORM_NAME \
                    -Pkotlin.native.cocoapods.archs="$ARCHS" \
                    -Pkotlin.native.cocoapods.configuration="$CONFIGURATION"
            SCRIPT
        }
    ]
                
end