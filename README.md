# In deinem Projektverzeichnis

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Minecraft](https://img.shields.io/badge/Minecraft-1.21.10+-green.svg)](https://www.minecraft.net/)
[![Java](https://img.shields.io/badge/Java-25-blue.svg)](https://openjdk.org/)
[![Gradle](https://img.shields.io/badge/Gradle-Build-yellow.svg)](https://gradle.org/)

Ein elegantes Minecraft Plugin, das es Spielern ermöglicht, ihr Inventar und ihre Erfahrungspunkte nach dem Tod zu behalten - ohne die Herausforderung des Spiels komplett zu entfernen.

## ✨ Features

- **🔒 Inventar-Schutz**: Behalte deine Items nach dem Tod
- **⭐ Erfahrungs-Schutz**: Verliere keine Erfahrungspunkte mehr
- **🎯 Präzise Kontrolle**: Separate Einstellungen für Inventar und Erfahrung
- **🌍 Welt-spezifische Einstellungen**: Unterschiedliche Regeln für verschiedene Welten
- **👥 Permission-System**: Fein abgestimmte Berechtigungen für Spieler
- **⚡ Leistungsoptimiert**: Keine spürbare Auswirkung auf Server-Performance

## 🚀 Installation

1. **Lade das Plugin herunter**
   - Hol dir die neueste Version von den [Releases](https://github.com/HobbyScripter/keepinventory/releases)

2. **Installiere auf deinem Server**
   - Platziere die `KeepInventory.jar` in deinem `plugins`-Ordner
   - Starte den Server neu oder führe `/reload` aus

3. **Konfiguriere das Plugin**
   - Eine `config.yml` wird automatisch erstellt
   - Passe die Einstellungen nach deinen Wünschen an

## ⚙️ Konfiguration

Die Standard-Konfiguration sieht folgendermaßen aus:

```yaml
# KeepInventory Configuration
keep-inventory: true
keep-exp: true

# Worlds configuration
worlds:
  world:
    keep-inventory: true
    keep-exp: true
  world_nether:
    keep-inventory: false
    keep-exp: true
  world_the_end:
    keep-inventory: false
    keep-exp: true
Konfigurations-Optionen:

    keep-inventory: Globaler Inventar-Schutz (true/false)

    keep-exp: Globaler Erfahrungs-Schutz (true/false)

    worlds: Welt-spezifische Einstellungen (überschreibt globale Einstellungen)
```
🔐 Berechtigungen
Permission	Beschreibung	Standard
keepinventory.keep	Erlaubt Inventar zu behalten	true
keepinventory.keep.exp	Erlaubt Erfahrung zu behalten	true
keepinventory.reload	Erlaubt Neuladen der Konfiguration	op
💬 Befehle
Befehl	Beschreibung	Permission
/keepinventory reload	Lädt die Konfiguration neu	keepinventory.reload
🛠️ Kompatibilität

    Minecraft Version: 1.21.10+

    Server Software: Paper, Spigot, Bukkit (kompatibel mit 1.21.10)

    Java Version: 25

    Plugins: Keine bekannten Inkompatibilitäten

📦 Entwicklung
Voraussetzungen

    Java 25 oder höher

    Gradle

    IDE deiner Wahl (IntelliJ IDEA, Eclipse, VS Code, etc.)

Bauen aus dem Quellcode
bash

git clone https://github.com/HobbyScripter/keepinventory.git
cd keepinventory
./gradlew build

Die gebaute JAR-Datei findest du im build/libs/-Ordner.
Entwicklung mit IntelliJ IDEA

    Öffne das Projekt in IntelliJ IDEA

    IDEA wird automatisch das Gradle-Projekt erkennen und einrichten

    Verwende die Gradle-Tasks zum Bauen und Entwickeln

Gradle Tasks
bash

./gradlew build    # Projekt bauen
./gradlew clean    # Build-Ordner bereinigen
./gradlew test     # Tests ausführen

🤝 Beitragen

Beiträge sind willkommen! Wenn du:

    einen Fehler gefunden hast

    eine neue Funktion vorschlagen möchtest

    das Plugin verbessern kannst

Bitte erstelle ein Issue oder einen Pull Request.
📄 Lizenz

Dieses Projekt ist unter der MIT License lizenziert - siehe LICENSE Datei für Details.
💡 Unterstützung

    Issues: GitHub Issues

    Diskussionen: GitHub Discussions

⭐ Wenn dir dieses Plugin gefällt, vergiss nicht dem Repository einen Stern zu geben!

    Hinweis: Dieses Plugin erfordert Minecraft 1.21.10 oder höher und Java 25 für die Ausführung.
