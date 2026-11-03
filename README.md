<p align="center">
  <img src=".github/assets/banner.png" alt="EnderCord Manager" width="100%">
</p>

<p align="center">
  <a href="https://github.com/EnderMythex/EndercordManager/releases/latest"><img src="https://img.shields.io/github/v/release/EnderMythex/EndercordManager?style=flat-square&label=release&labelColor=000&color=1c1c1e" alt="Latest release"></a>
  <img src="https://img.shields.io/badge/Android-9%2B-1c1c1e?style=flat-square&labelColor=000" alt="Android 9+">
  <a href="LICENSE"><img src="https://img.shields.io/badge/license-OSL_3.0-1c1c1e?style=flat-square&labelColor=000" alt="License"></a>
</p>

<p align="center">
  Installs <a href="https://github.com/EnderMythex/EndercordMobile"><b>EnderCord</b></a> on Android, no root needed.
</p>

<br>

## Install

1. Download [**EndercordManager.apk**](https://github.com/EnderMythex/EndercordManager/releases/latest/download/EndercordManager.apk) and open it. Android asks you to allow installing apps from your browser the first time.
2. Open EnderCord Manager and tap **Install**.
3. It downloads Discord, adds EnderCord to it and installs it as a separate app, so the official Discord stays untouched. Log in and you're done.

To update Discord or EnderCord's loader, open the manager again and tap **Update**. EnderCord itself updates on its own every time Discord starts.

<br>

## What it does

- Downloads the latest Discord, Stable, Beta or Alpha.
- Adds the [EnderCord loader](https://github.com/EnderMythex/EndercordMobile) to it with [LSPatch](https://github.com/LSPosed/LSPatch), which works without root.
- Gives it its own package name (`app.endercord`) and a black icon, so it sits next to the official app.
- Installs it normally, or through [Shizuku](https://shizuku.rikka.app) for silent installs.
- Updates itself when a new version is released.

<br>

## Build

You need JDK 17 and the Android SDK.

```sh
./gradlew assembleRelease
```

Every push to `main` builds the app on GitHub Actions and publishes it as a new release. To sign releases with your own key instead of a debug one, add these repository secrets: `KEYSTORE` (the `.jks` file in base64), `KEYSTORE_PASSWORD`, `KEY_ALIAS` and `KEY_PASSWORD`.

<br>

## Credits

EnderCord Manager is a fork of [Revenge Manager](https://github.com/revenge-mod/revenge-manager), itself based on the Vendetta and [Aliucord](https://github.com/Aliucord/Manager) managers. Thanks to all of their contributors. Licensed under the [Open Software License 3.0](LICENSE).

Discord is a trademark of Discord Inc. EnderCord is not affiliated with or endorsed by Discord Inc. or Revenge.
