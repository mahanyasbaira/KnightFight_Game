🛡️ Knights of Legend: A Text-Based RPG



🎮 Overview
Knights of Legend is a re-imagined, text-based RPG inspired by the classic Knight Fight game. It places you in command of a team of knights as they battle monsters, wield mystical fortunes, and level up through rich, strategic combat.

This Java console-based game focuses on clean architecture and modular design using interfaces and abstract classes—built for extensibility, testability, and maintainability.

🗝️ Key Features
📂 File Loading & Saving: Load knights, monsters, and fortunes from CSV files. Save progress between sessions.

🛡️ Knight Management: Control up to 4 active knights at a time, each with unique combat stats and experience growth.

🔮 Fortunes: Bonus cards that provide strategic buffs (or nerfs!) before each quest.

👹 Monster Encounters: Random battles scale with your active party size.

🧙 Strategic Combat: Classic RPG dice-based mechanics with customizable D4–D20 rolls.

🧑‍🤝‍🧑 Team Management: Swap, inspect, or heal knights between quests.

📜 Console UI: Text-based input/output via System.in and System.out.

⚔️ Game Mechanics
🎲 Attributes & Dice Rolls
Core Stats: armor, maxHP, hitModifier, and damageDie as defined in the Attributes interface.

Dice Types: Handled by DiceType enum and DiceSet utility, ranging from D4 to D20.

🧠 Combat Logic
Hit Roll: D20 + hitModifier ≥ armor → Hit!

Damage: Roll damageDie to determine damage output.

XP System: Knights earn experience for each monster defeated.

All logic is handled by the CombatEngine.

🧱 Project Architecture
bash
Copy
Edit
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
Modular components rely heavily on interfaces and abstract classes to ensure loose coupling and clean separation of concerns.

🚀 How to Run
Compile and run from the command line:

bash
Copy
Edit
# Compile all source files
javac src/*.java

# Run the game with default files
java Main
You can also provide custom data/save files:

bash
Copy
Edit
java Main --data=gamedata.csv mysave.csv
📚 Class Highlights
Component	Description
Attributes	Interface defining base combat stats
DiceType	Enum for dice types (D4, D6, ..., D20)
Knight	Playable character class
MOB	Base class for knights and monsters
Fortune	Temporary combat buffs/debuffs
GameView	Input/output abstraction
CombatEngine	Manages combat logic
GameController	Connects data, view, and engine
Main	Starts the application

See full class structure in the UML Diagram.

🎓 Academic Context
This project was developed as part of a practical exercise in:

Object-Oriented Design (OOD)

Interface-based architecture

Java console applications

CSV data parsing and serialization

Combat simulation and game loop logic

It's an educational foundation for learning clean code, testability, and modular design in real-world software development.

🌟 Future Enhancements
🧳 Inventory System: Equip items with buffs or stats.

🗺️ Choose-Your-Adventure Quests: Add story branching.

🖼️ Graphical UI: Plug in a JavaFX or Swing interface.

🎭 Enemy AI: Smarter, adaptive monsters.

🤝 Contributors
Developed by @mahanyasbaira
Colorado State University · CS 164: Object-Oriented Programming
