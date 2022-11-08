import SwiftUI
import multiplatform_locale

@main
struct LocaleApp : App {
    var body: some Scene {
        WindowGroup {
            ContentView()
        }
    }
}

struct ContentView: View {
    var body: some View {
        VStack {
            let currentLocaleString = Locales.shared.currentLocaleString()
            Text("Current Locale: \(currentLocaleString)")

            if let locale = multiplatform_locale.Locale.Companion.shared.fromOrNull(locale: currentLocaleString) {
                Text("Google Play Store Locale: \(locale.googlePlayStoreLocale()?.description() ?? "/")")
                Text("Apple App Store Locale: \(locale.appleAppStoreLocale()?.description() ?? "/")")
            }

            Text("Current Locale Strings: \(Locales.shared.currentLocaleStrings().joined(separator: ", "))")
                .padding()

            let countries = Country.values()
            Text("All countries: \((0..<countries.size).compactMap { countries.get(index: $0) }.map { $0.displayName() }.joined(separator: ", "))")
                .padding()

            let languages = Language.values()
            Text("All languages: \((0..<languages.size).compactMap { languages.get(index: $0) }.map { $0.displayName() }.joined(separator: ", "))")
                .padding()
        }
    }
}
