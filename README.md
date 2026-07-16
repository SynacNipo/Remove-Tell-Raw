# RemoveTellRaw

Disables `/tellraw` completely — players, console, command blocks, and other plugins.

- Overrides the command in the server's CommandMap with a no-op
- Cancels `PlayerCommandPreprocessEvent` and `ServerCommandEvent`
- Requires **Paper 26.1+** and **Java 25**

```yaml
# put the jar in plugins/ and restart
```
