Knights of Legend: A Text-Based RPG
Project Overview
"Knights of Legend" is a text-based adventure game developed as a practical project. It re-imagines the classic "Knight Fight" game, offering players an immersive experience through managing knights, engaging in combat with monsters, and leveraging the power of fortunes. The game emphasizes modular design, using abstract classes and interfaces to ensure extensibility and maintainability.

Key Features
File Reading and Saving: The game's data, including knights, monsters, and fortunes, is loaded from CSV files at startup. Players can also save their progress to a specified file.

Knights: Players manage a roster of knights, each with unique attributes (health, armor, hit modifier, damage die, experience points). Up to four knights can be active on a quest at any given time.

Fortunes / Bonus Cards: Before embarking on a quest, active knights draw random "fortune" cards. These cards provide temporary bonuses or penalties to a knight's attributes, adding a layer of strategy and unpredictability to encounters.

MOBs / Monsters: Knights face various monsters in random encounters. The number of monsters encountered scales with the number of active knights.

Team Management: Outside of quests, players can view detailed information about each knight and manage their active party. Defeated knights return to the general pool and are healed.

Text-Based Interface: The entire game interaction occurs through the console (System.in/System.out), but its design allows for easy integration with different user interfaces in the future.

Game Mechanics Highlights
Attributes
Core combat statistics are defined by the Attributes interface, including armor, maxHP, damageDie, and hitModifier [cite: mahanyasbaira/knightfight_game/KnightFight_Game-3898f19c1afe331c3c6c393631d82461a1e8b4b8/docs/Attributes.html].

Dice Types
Damage and hit calculations utilize various dice types (D4, D6, D8, D10, D12, D20), managed by the DiceType enumeration and DiceSet class [cite: mahanyasbaira/knightfight_game/KnightFight_Game-3898f19c1afe331c3c6c393631d82461a1e8b4b8/src/DiceType.java, mahanyasbaira/knightfight_game/KnightFight_Game-3898f19c1afe331c3c6c393631d82461a1e8b4b8/docs/DiceType.html, mahanyasbaira/knightfight_game/KnightFight_Game-3898f19c1afe331c3c6c393631d82461a1e8b4b8/docs/DiceSet.html].

Combat System
Combat involves a D20 roll plus a hit modifier against an opponent's armor to determine a hit, followed by a damage die roll to calculate damage [cite: mahanyasbaira/knightfight_game/KnightFight_Game-3898f19c1afe331c3c6c393631d82461a1e8b4b8/docs/CombatEngine.html]. Knights gain XP upon defeating monsters [cite: mahanyasbaira/knightfight_game/KnightFight_Game-3898f19c1afe331c3c6c393631d82461a1e8b4b8/docs/CombatEngine.html].

Project Structure and Design
The game's architecture follows an object-oriented approach, utilizing interfaces and abstract classes for a flexible design. Key components include:

DiceType: An enumeration for different dice used in the game [cite: mahanyasbaira/knightfight_game/KnightFight_Game-3898f19c1afe331c3c6c393631d82461a1e8b4b8/src/DiceType.java].

Attributes: An interface defining core combat attributes [cite: mahanyasbaira/knightfight_game/KnightFight_Game-3898f19c1afe331c3c6c393631d82461a1e8b4b8/src/Attributes.java].

Fortune: Represents bonus cards that modify attributes [cite: mahanyasbaira/knightfight_game/KnightFight_Game-3898f19c1afe331c3c6c393631d82461a1e8b4b8/src/Fortune.java].

MOB: The base class for all "mobile objects" (monsters and knights), implementing Attributes [cite: mahanyasbaira/knightfight_game/KnightFight_Game-3898f19c1afe331c3c6c393631d82461a1e8b4b8/src/MOB.java].

Knight: Extends MOB and represents playable characters, including XP and active fortunes [cite: mahanyasbaira/knightfight_game/KnightFight_Game-3898f19c1afe331c3c6c393631d82461a1e8b4b8/src/Knight.java].

GameData: An abstract class for managing game data (knights, monsters, fortunes), with CSVGameData providing a concrete implementation for CSV file handling [cite: mahanyasbaira/knightfight_game/KnightFight_Game-3898f19c1afe331c3c6c393631d82461a1e8b4b8/docs/GameData.html, mahanyasbaira/knightfight_game/KnightFight_Game-3898f19c1afe331c3c6c393631d82461a1e8b4b8/docs/CSVGameData.html].

GameView: An interface for handling user input and output, with ConsoleView providing a text-based implementation [cite: mahanyasbaira/knightfight_game/KnightFight_Game-3898f19c1afe331c3c6c393631d82461a1e8b4b8/docs/GameView.html, mahanyasbaira/knightfight_game/KnightFight_Game-3898f19c1afe331c3c6c393631d82461a1e8b4b8/docs/ConsoleView.html].

CombatEngine: Manages the combat logic between knights and monsters [cite: mahanyasbaira/knightfight_game/KnightFight_Game-3898f19c1afe331c3c6c393631d82461a1e8b4b8/docs/CombatEngine.html].

GameController: The central orchestrator, connecting GameData, GameView, and CombatEngine [cite: mahanyasbaira/knightfight_game/KnightFight_Game-3898f19c1afe331c3c6c393631d82461a1e8b4b8/docs/GameController.html].

Main: The entry point of the application, responsible for parsing command-line arguments and initializing the game components [cite: mahanyasbaira/knightfight_game/KnightFight_Game-3898f19c1afe331c3c6c393631d82461a1e8b4b8/docs/Main.html].

The class relationships are further detailed in the project's UML diagrams [cite: mahanyasbaira/knightfight_game/KnightFight_Game-3898f19c1afe331c3c6c393631d82461a1e8b4b8/uml.md].

How to Run
To run the game, compile the Java source files and execute the Main class.

Default Execution:
The game will load gamedata.csv and knights.csv by default [cite: mahanyasbaira/knightfight_game/KnightFight_Game-3898f19c1afe331c3c6c393631d82461a1e8b4b8/docs/Main.html].

java Main

Custom Data and Save Files:
You can specify custom data and save files using command-line arguments:

java Main --data={data_filename.csv} {save_filename.csv}

--data={data_filename.csv}: Specifies the game data file containing MOBs and Fortunes [cite: mahanyasbaira/knightfight_game/KnightFight_Game-3898f19c1afe331c3c6c393631d82461a1e8b4b8/docs/Main.html].

{save_filename.csv}: Specifies the file for loading and saving knight progress [cite: mahanyasbaira/knightfight_game/KnightFight_Game-3898f19c1afe331c3c6c393631d82461a1e8b4b8/docs/Main.html].

For example:

java Main --data=gamedata.csv mygame.csv

Academic Context
This project serves as a comprehensive exercise in object-oriented programming, design patterns (like polymorphism), and software architecture. It encourages students to break down a large problem into smaller, manageable components, test frequently, and build incrementally. The separation of concerns (e.g., GameData for data, GameView for presentation, CombatEngine for logic) is a key learning objective.

Future Enhancements (Stretch Goals)
Inventory System: Implement inventory items with their own attributes that provide bonuses to knights.

Choose Your Own Adventure: Integrate a branching narrative system to influence quests and outcomes.

Graphical User Interface (GUI): Replace the console-based GameView with a graphical interface.
