# RemoveTellRaw

Disables `/tellraw` completely — players, console, command blocks, and other plugins.

- Paper version: overrides the command in the server's CommandMap with a no-op and blocks command preprocessing
- Fabric version: registers a silent replacement for `/tellraw` so the command stays disabled on supported Fabric builds
- Supports the Paper API range from **26.1** through **26.2** and the Fabric versions requested by the project matrix: **1.21.11**, **26.1**, **26.1.1**, **26.1.2**, and **26.2**
- Requires **Java 25** for the Paper build and **Java 21** for the Fabric build

## Paper usage

1. Place the jar in your server's `plugins/` folder
2. Restart the server (or run `/reload`)
3. `/tellraw` is now disabled for everyone

## Fabric usage

1. Put the generated Fabric jar in your mod folder
2. Launch the matching Minecraft/Fabric version
3. `/tellraw` is silently blocked

## Version matrix

The project includes the requested compatibility targets:

- 1.21.11
- 26.1
- 26.1.1
- 26.1.2
- 26.2

The Fabric build uses the matching Fabric API versions and loader versions supplied for each target.
