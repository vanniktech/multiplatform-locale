Pod::Spec.new do |spec|
    spec.name                     = 'MultiplatformLocale'
    spec.version                  = '0.7.0'
    spec.homepage                 = 'https://github.com/vanniktech/multiplatform-locale'
    spec.source                   = { :http=> ''}
    spec.authors                  = 'Niklas Baudy'
    spec.license                  = 'MIT'
    spec.summary                  = 'Multiplatform Locale for iOS, Android and JVM via Kotlin Multiplatform'
    spec.vendored_frameworks      = 'build/cocoapods/framework/multiplatform_locale.framework'
    spec.libraries                = 'c++'
                
                
                
    if !Dir.exist?('build/cocoapods/framework/multiplatform_locale.framework') || Dir.empty?('build/cocoapods/framework/multiplatform_locale.framework')
        raise "

        Kotlin framework 'multiplatform_locale' doesn't exist yet, so a proper Xcode project can't be generated.
        'pod install' should be executed after running ':generateDummyFramework' Gradle task:

            ./gradlew :multiplatform-locale:generateDummyFramework

        Alternatively, proper pod installation is performed during Gradle sync in the IDE (if Podfile location is set)"
    end
                
    spec.pod_target_xcconfig = {
        'KOTLIN_PROJECT_PATH' => ':multiplatform-locale',
        'PRODUCT_MODULE_NAME' => 'multiplatform_locale',
    }
                
    spec.script_phases = [
        {
            :name => 'Build MultiplatformLocale',
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