# Mini Ball Game (terminal)

Build and run:

```bash
javac BallGame.java
java BallGame
```

Controls:
- `a` then Enter: move paddle left
- `d` then Enter: move paddle right
- `q` then Enter: quit

Notes:
- The game uses simple ANSI escape codes to clear the terminal; it works best in a Unix-style terminal.
- Input is polled via `BufferedReader.ready()` so you may need to press Enter after keys in some terminals.
