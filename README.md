# OMNISENT
## Hybrid Robotic Surveillance & Autonomous Exploration Platform

**Status:** Proposal and design-stage repository. Planned features are not claimed as completed or field-tested.

OMNISENT is a proposed modular robotics platform for remote ground-robot operation, mission monitoring, camera-assisted observation, and structured mission-data management. The proposed architecture combines a Java application layer, Python-based voice/vision services, an ESP8266 communication bridge, and Arduino C/C++ embedded control.

### Objectives
- Demonstrate Java OOP, interfaces, encapsulation, exception handling, and networking.
- Define a maintainable command and mission-management architecture.
- Plan integration with existing Python voice/camera services and embedded hardware.
- Document requirements, UML/design diagrams, milestones, risks, and testing.
- Provide a future path toward improved localization, obstacle avoidance, mapping, and drone-assisted observation.

### Proposed architecture
1. **Java presentation/application:** dashboard, command validation, robot coordination, mission management.
2. **Python services:** voice recognition and camera/vision integration, subject to interface validation.
3. **Communication bridge:** ESP8266 over a documented TCP/serial protocol.
4. **Embedded controller:** Arduino C/C++ for sensors and motor control.
5. **Data layer:** mission records, command events, status history, image references.

### Proposed stack
| Area | Technology |
|---|---|
| Main application | Java |
| Interface | JavaFX or Swing (final choice pending) |
| Networking | Java TCP sockets / HTTP API where appropriate |
| Voice and vision | Python |
| Embedded control | Arduino C/C++ |
| Wireless bridge | ESP8266 |
| Persistence | JSON initially; relational database if needed |
| Diagrams | Mermaid and PlantUML |
| Proposal | LaTeX |
| Version control | Git and GitHub |

### Repository structure
- `proposal/` — LaTeX proposal and bibliography
- `diagrams/` — Mermaid and PlantUML source
- `docs/` — requirements and development plan
- `prototype/` — Java starter prototype and run instructions
- `assets/` — exported diagrams and proposal visuals

### Build proposal PDF
Install MiKTeX or TeX Live, then from `D:\OMNISENT\proposal` run:
```bat
pdflatex proposal.tex
pdflatex proposal.tex
```
The main architecture figure is drawn with TikZ. Other diagrams are kept as source files; export them using Mermaid Live Editor or PlantUML and add rendered files to `assets/` if you want them embedded in the final PDF.

### Diagram tools
- Mermaid: https://mermaid.live/
- PlantUML: https://www.plantuml.com/plantuml/uml/
- Overleaf (alternative LaTeX editor): https://www.overleaf.com/

### Important scope and safety note
The initial prototype is not a fully autonomous robot and does not implement drone flight. GPS, LiDAR mapping, autonomous navigation, and drone integration are future work. Before remote deployment, implement authentication, access controls, input validation, connection timeouts, safe stop behaviour, and controlled hardware tests.
