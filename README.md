# Fast Math — NeoForge

[![Minecraft](https://img.shields.io/badge/Minecraft-1.21.1-62B47A?logo=minecraft&logoColor=white)](https://www.minecraft.net/)
[![NeoForge](https://img.shields.io/badge/NeoForge-1.21.1-262626?logo=neoforge&logoColor=white)](https://neoforged.net/)
[![Environment](https://img.shields.io/badge/environment-client%20%2B%20server-1976d2)](https://neoforged.net/)
[![Java](https://img.shields.io/badge/Java-21-orange?logo=openjdk&logoColor=white)](https://adoptium.net/)

A NeoForge port of Fast Math (originally released as Super Fast Math), created by EliasB. This repository adapts the original Fabric mod to run on NeoForge for Minecraft 1.21.1.

---

## About

Fast Math is a lightweight optimization mod focused on improving the performance of frequently executed mathematical operations and low-level game logic in Minecraft.

Instead of relying solely on default implementations, the mod replaces several frequently used math functions and systems with faster alternatives, targeting areas such as:

- Entity movement and AI
- Entity orientation
- Collision detection
- Chunk and block coordinate calculations
- Redstone logic
- World simulation
- Interpolation and movement calculations

This repository is an independent NeoForge port of the original Fast Math mod created by EliasB. It is not an official release from the original author.

---

## What It Optimizes

- Faster sine and cosine via optimized lookup tables
- Hardware-accelerated square root (native SQRTSS instruction where applicable)
- Improved floor and clamp operations
- Optimized interpolation (`lerp`) using fused multiply-add operations
- `BlockPos` bit-packing for faster block/chunk coordinate encoding and decoding

> Note: the `atan2` optimization used for entity orientation was reverted to exact mathematical behavior, in both the original mod and this port, to avoid projectile-angle inaccuracies.

---

## Benchmarks

The original Fast Math project was benchmarked on a superflat world with 200 zombies performing pathfinding, active redstone, `/gamerule randomTickSpeed 1000`, and Spark profiling.

| Metric | Vanilla | Fast Math | Improvement |
|--------|--------:|----------:|------------:|
| TPS (1 min) | 14.13 | 20.00 | +41% |
| TPS (5 min) | 14.94 | 19.88 | +33% |
| MSPT median | 51.4 ms | 43.4 ms | -8 ms |
| MSPT max spike | 202 ms | 153 ms | -24% |

Original test environment: Minecraft 26.1.2, Fabric, Java 25, Intel Core i5-12400F, profiled with Spark.

These benchmarks come from the original Fast Math (Fabric) project and are not benchmarks of this NeoForge port. Actual results may vary depending on CPU, Minecraft version, world conditions, entity count, and installed mods.

---

## Why Fast Math?

Minecraft performs mathematical calculations continuously across systems such as entity AI and movement, entity orientation, world simulation, block and chunk coordinate math, redstone, collision detection, and interpolation.

Optimizing these frequently executed operations reduces CPU overhead and frees up time for other game logic. Both client and server environments benefit, and server operators running mob farms, technical builds, or large entity counts are likely to see the greatest impact.

---

## Supported Versions

| Minecraft | Loader | Environment | Status |
|-----------|--------|-------------|--------|
| 1.21.1 | NeoForge | Client + Server | Supported |

Additional Minecraft versions may be supported in the future.

---

## Installation

### Requirements

- Minecraft 1.21.1
- NeoForge for Minecraft 1.21.1
- Java 21

### Steps

1. Install Minecraft 1.21.1.
2. Install the appropriate NeoForge version.
3. Download the latest Fast Math — NeoForge `.jar`.
4. Place the `.jar` inside your Minecraft `mods` folder.
5. Start Minecraft using the NeoForge profile.

No additional configuration is required.

---

## Compatibility

Fast Math is lightweight and designed to work alongside other performance and optimization mods, including Sodium, other rendering optimizations, server performance mods, and general-purpose optimization mods.

Compatibility can still vary depending on Minecraft version, NeoForge version, mappings, and other installed mods. If you run into an incompatibility, please open an issue with as much detail as possible.

Please include:

- Minecraft version
- NeoForge version
- Fast Math version
- Java version
- List of installed mods
- Complete crash report
- Relevant log output

---

## Technical Details

Fast Math modifies selected Minecraft mathematical and coordinate-related implementations using Mixin, targeting classes including `Mth` and `BlockPos`.

The original mod was built for Fabric. This NeoForge port adapts the required loader-specific integration while preserving the optimization goals of the original project.

Design goals:

- Minimize computational overhead
- Preserve vanilla behavior
- Avoid unnecessary configuration
- Keep the mod lightweight
- Provide optimizations that are transparent to the user

Fast Math is designed as a zero-configuration optimization mod, and works on both the client and server side.

---

## Development

This project is developed for NeoForge using Java 21.

### Requirements

- Java 21
- Git
- IntelliJ IDEA or another Java IDE
- Minecraft 1.21.1 NeoForge development environment

### Clone the repository

```bash
git clone https://github.com/manel740/Super-Fast-Math-ReFoxed.git
cd Super-Fast-Math-ReFoxed
```

### Build

On Linux/macOS:

```bash
./gradlew build
```

On Windows:

```powershell
.\gradlew.bat build
```

The compiled mod will be generated in:

```text
build/libs/
```

---

## Credits

Fast Math (originally Super Fast Math) was created by EliasB. The original creator deserves credit for the concept, original implementation, optimizations, and the underlying work this port is based on.

Original creator: EliasB
[EliasB — CurseForge Profile](https://www.curseforge.com/members/eliasb/projects)

For the original project, releases, and documentation, refer to EliasB's own pages.

---

## License

Refer to the license of the original Fast Math / Super Fast Math project for the licensing terms applicable to the original code. This repository contains the NeoForge-specific changes required for the port.

If you intend to redistribute this project, publish modified versions, include the code in another project, or create derivative works, please verify that your use complies with the original project's license and any applicable terms.

---

## Disclaimer

This repository is a community-made NeoForge port of Fast Math / Super Fast Math. The mod and its original implementation were created by EliasB.

This project is not affiliated with, endorsed by, or officially maintained by EliasB unless explicitly stated otherwise. This NeoForge port should not be interpreted as an official release from the original author.

---

## Acknowledgements

Thanks to EliasB for creating Fast Math and making the original project available to the Minecraft modding community. This NeoForge port exists to bring the same optimization approach to NeoForge players and server administrators.
