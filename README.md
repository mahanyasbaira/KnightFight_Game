# 🛡️ Knights of Legend: A Text-Based RPG

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/Object--Oriented-Flexible-blueviolet?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Complete-brightgreen?style=for-the-badge)

---

## 🎮 Overview

**Knights of Legend** is a re-imagined, text-based RPG inspired by the classic **Knight Fight** game. It places you in command of a team of knights as they battle monsters, wield mystical fortunes, and level up through rich, strategic combat.

This Java console-based game focuses on clean architecture and modular design using interfaces and abstract classes—built for extensibility, testability, and maintainability.

---

## 🗝️ Key Features

- **📂 File Loading & Saving**: Load knights, monsters, and fortunes from CSV files. Save progress between sessions.
- **🛡️ Knight Management**: Control up to 4 active knights at a time, each with unique combat stats and experience growth.
- **🔮 Fortunes**: Bonus cards that provide strategic buffs (or nerfs!) before each quest.
- **👹 Monster Encounters**: Random battles scale with your active party size.
- **🧙 Strategic Combat**: Classic RPG dice-based mechanics with customizable D4–D20 rolls.
- **🧑‍🤝‍🧑 Team Management**: Swap, inspect, or heal knights between quests.
- **📜 Console UI**: Text-based input/output via `System.in` and `System.out`.

---

## ⚔️ Game Mechanics

### 🎲 Attributes & Dice Rolls

- **Core Stats**: `armor`, `maxHP`, `hitModifier`, and `damageDie` as defined in the `Attributes` interface.
- **Dice Types**: Handled by `DiceType` enum and `DiceSet` utility, ranging from D4 to D20.

### 🧠 Combat Logic

1. **Hit Roll**: `D20 + hitModifier ≥ armor` → Hit!
2. **Damage**: Roll `damageDie` to determine damage output.
3. **XP System**: Knights earn experience for each monster defeated.

> All logic is handled by the [`CombatEngine`](docs/CombatEngine.html).

---

## 🧱 Project Architecture

```bash
📁 src/
├── CombatEngine.java       # Battle logic
├── ConsoleView.java        # Console input/output
├── DiceType.java           # Dice enumeration
├── DiceSet.java            # Dice handling
├── Knight.java             # Knight class
├── MOB.java                # Base class for Knights & Monsters
├── Fortune.java            # Fortune card logic
├── GameController.java     # Central orchestrator
├── GameData.java           # Abstract data loader
├── CSVGameData.java        # Concrete implementation
└── Main.java               # Entry point
