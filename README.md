<div align="center">

# ⚡ Fast Math — NeoForge

**A high-performance mathematical optimization mod for Minecraft**

A NeoForge port of **Fast Math**, originally created by **EliasB**.

[![Minecraft](https://img.shields.io/badge/Minecraft-1.21.1-62B47A?logo=minecraft\&logoColor=white)](https://www.minecraft.net/)
[![NeoForge](https://img.shields.io/badge/NeoForge-1.21.1-262626?logo=neoforge\&logoColor=white)](https://neoforged.net/)
[![Environment](https://img.shields.io/badge/environment-client%20%2B%20server-1976d2)](https://neoforged.net/)
[![Java](https://img.shields.io/badge/Java-21-orange?logo=openjdk\&logoColor=white)](https://adoptium.net/)

</div>

---

## 📖 About

**Fast Math** is a lightweight Minecraft optimization mod focused on improving the performance of frequently executed mathematical operations and low-level game logic.

Minecraft performs mathematical calculations constantly across systems such as:

* Entity movement and AI
* Entity orientation
* Collision detection
* Chunk and block coordinate calculations
* Redstone logic
* World simulation
* Interpolation and movement calculations

Fast Math replaces selected mathematical operations with optimized implementations designed to reduce computational overhead while preserving Minecraft's expected behavior.

> **This repository is an independent NeoForge port of the original Fast Math mod created by EliasB.**

---

## ⚡ Optimizations

Fast Math targets several mathematical operations that are frequently executed during Minecraft's game loop.

### Trigonometric Functions

Optimized implementations for frequently used:

* Sine
* Cosine

These operations can be called thousands of times during normal gameplay, particularly by entities and game logic.

### Square Root

Uses a hardware-accelerated square-root implementation where applicable, reducing the cost of repeated square-root calculations.

### Floor & Clamp

Optimized implementations for commonly used:

* Floor operations
* Clamp operations

### Entity Orientation

Fast mathematical operations can benefit systems that frequently calculate entity orientation and movement.

> **Note:** The `atan2` optimization was reverted to exact mathematical behavior to avoid potential projectile-angle inaccuracies.

### Interpolation

Optimized interpolation (`lerp`) using fused multiply-add operations where applicable.

### BlockPos

Optimized `BlockPos` bit-packing operations used for encoding and decoding block/chunk coordinates.

---

## 📊 Performance

The original Fast Math project was benchmarked under a heavily stressed Minecraft environment involving:

* A superflat world
* 200 zombies performing pathfinding
* Active redstone
* `randomTickSpeed 1000`
* Spark performance profiling

### Original Project Benchmark

| Metric          | Vanilla | SuperFastMath | Improvement |
| --------------- | ------: | ------------: | ----------: |
| TPS — 1 minute  |   14.13 |         20.00 |    **+41%** |
| TPS — 5 minutes |   14.94 |         19.88 |    **+33%** |
| MSPT median     | 51.4 ms |       43.4 ms |   **−8 ms** |
| MSPT max spike  |  202 ms |        153 ms |    **−24%** |

> **Important:** These benchmarks originate from the original Fast Math project and should not be interpreted as benchmarks of this NeoForge port.

### Original Test Environment

* **Minecraft:** 26.1.2
* **Loader:** Fabric
* **Java:** 25
* **CPU:** Intel Core i5-12400F
* **Profiler:** Spark

Actual performance improvements may vary significantly depending on CPU, Minecraft version, world conditions, entity count, and installed mods.

---

## 🚀 Why Fast Math?

Minecraft's game engine performs mathematical operations continuously.

Optimizing frequently executed operations can reduce CPU overhead and improve the amount of time available for other game logic.

Fast Math can particularly benefit workloads involving:

* 🧠 Entity AI and movement
* 🧭 Entity orientation
* 🌍 World simulation
* 🧱 Block and chunk coordinate calculations
* 🔴 Redstone systems
* 💥 Collision calculations
* 🔄 Interpolation and movement
* 🐄 Large numbers of entities
* 🏭 Mob farms and technical Minecraft environments

Both **client and server environments** can benefit from these optimizations.

Server operators running heavily simulated worlds or large entity populations may see the greatest impact.

---

## 📦 Supported Versions

| Minecraft  | Loader       | Environment     | Status      |
| ---------- | ------------ | --------------- | ----------- |
| **1.21.1** | **NeoForge** | Client + Server | ✅ Supported |

Additional Minecraft versions may be supported in the future.

---

## 🔧 Installation

### Requirements

* Minecraft **1.21.1**
* **NeoForge** for Minecraft 1.21.1
* Java **21**

### Installation

1. Install Minecraft **1.21.1**.
2. Install the appropriate **NeoForge** version.
3. Download the latest **Fast Math — NeoForge** `.jar`.
4. Place the `.jar` inside your Minecraft `mods` folder.
5. Start Minecraft using the NeoForge profile.

No additional configuration is required.

---

## 🧩 Compatibility

Fast Math is designed to be lightweight and can be used alongside other performance and optimization mods.

It is intended to coexist with mods such as:

* Sodium
* Other rendering optimizations
* Server performance mods
* General-purpose optimization mods

However, compatibility can vary depending on the Minecraft version, NeoForge version, mappings, and other installed mods.

If you encounter an incompatibility, please report it with as much information as possible.

### Please include

* Minecraft version
* NeoForge version
* Fast Math version
* Java version
* List of installed mods
* Complete crash report
* Relevant log output

---

## ⚙️ Technical Details

Fast Math modifies selected Minecraft mathematical and coordinate-related implementations using **Mixin**.

The original implementation targets systems including:

* `Mth`
* `BlockPos`

The NeoForge port adapts the required loader-specific integration while maintaining the optimization goals of the original project.

### Design Goals

The project aims to:

* Minimize computational overhead
* Preserve vanilla behavior
* Avoid unnecessary configuration
* Keep the mod lightweight
* Provide optimizations that are transparent to the user

Fast Math is designed as a **zero-configuration optimization mod**.

---

## 🛠️ Development

This project is developed for **NeoForge** using **Java 21**.

### Requirements

* Java 21
* Git
* IntelliJ IDEA or another Java IDE
* Minecraft 1.21.1 NeoForge development environment

### Clone the repository

```bash
git clone https://github.com/manel740/Super-Fast-Math-ReFoxed.git
cd YOUR_REPOSITORY
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

## 📜 Credits

### Original Fast Math

**Fast Math** was originally created by **EliasB**.

The original creator deserves credit for the concept, original implementation, optimizations, and underlying work on which this port is based.

**Original creator:** EliasB

[EliasB — CurseForge Profile](https://www.curseforge.com/members/eliasb/projects?utm_source=chatgpt.com)

---

## 🔗 Original Project

For the original Fast Math project, releases, documentation, and information about the original implementation, please refer to the original project maintained by EliasB.

[EliasB's CurseForge Projects](https://www.curseforge.com/members/eliasb/projects?utm_source=chatgpt.com)

---

## 📄 License

Please refer to the license of the original Fast Math project for the licensing terms applicable to the original code.

This repository contains NeoForge-specific modifications required for the port.

If you intend to:

* Redistribute this project
* Publish modified versions
* Include the code in another project
* Create derivative works

please verify that your use complies with the original project's license and any applicable terms.

---

## ⚠️ Disclaimer

This repository is a **community-made NeoForge port** of Fast Math.

**Fast Math and its original implementation were created by EliasB.**

This project is **not affiliated with, endorsed by, or officially maintained by EliasB**, unless explicitly stated otherwise.

The NeoForge port should not be interpreted as the original author's official release.

---

## ❤️ Acknowledgements

Special thanks to **EliasB** for creating Fast Math and making the original project available to the Minecraft modding community.

This NeoForge port exists to make the project's optimization approach available to **NeoForge players and server administrators**.

---

<div align="center">

**Fast Math — NeoForge**

*Optimize the math. Keep the game moving.*

</div>
