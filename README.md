# RemoveTellRaw

Disables `/tellraw` completely — players, console, command blocks, and other plugins.

- Overrides the command in the server's CommandMap with a no-op
- Cancels `PlayerCommandPreprocessEvent` and `ServerCommandEvent`
- Requires **Paper 26.1+** and **Java 25**

## Usage

1. Place the jar in your server's `plugins/` folder
2. Restart the server (or run `/reload`)
3. `/tellraw` is now disabled for everyone
