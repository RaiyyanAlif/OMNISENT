# OMNISENT Development Plan

## Process model
Use an iterative and incremental model. Each phase produces a reviewable artefact and is tested before moving to hardware integration.

| Phase | Activities | Deliverables | Exit criteria |
|---|---|---|---|
| 1. Requirements | Confirm scope, hardware, constraints, and risks | Requirements specification | Priorities and assumptions documented |
| 2. Design | Architecture, DFD, use case, activity, ERD, class/object diagrams | Proposal and diagram sources | Diagrams consistent with requirements |
| 3. Java prototype | Domain classes, command abstraction, simple interface | Java source | At least five diagrammed classes used |
| 4. Communication | Confirm protocol, timeouts, status parsing | Integration notes/tests | Controlled command/response test passes |
| 5. Service integration | Voice/camera service contract | Integration notes | Failures reported; manual control remains available |
| 6. Verification | Unit, interface, and controlled hardware tests | Test report | Outcomes documented |
| 7. Finalization | Update proposal, README, diagrams, repository | Submission package | Reproducible and clearly scoped |

## Illustrative four-week schedule
Replace dates with actual course deadlines and available time.

| Work package | Duration | Dependency |
|---|---:|---|
| Requirements and feasibility | 3 days | Start |
| Proposal and diagrams | 4 days | Requirements |
| Java class design and interface | 4 days | Design |
| Command model and adapter tests | 4 days | Java prototype |
| Python service integration | 3 days | Command layer |
| Controlled system tests | 3 days | Integration |
| Documentation and evaluation | 3 days | Testing |

## Milestones
- M1: proposal and requirements baseline.
- M2: six diagrams reviewed.
- M3: Java prototype uses at least five diagrammed classes.
- M4: command flow demonstrated using mock or controlled connection.
- M5: evaluation and limitations documented.

## Risk register
| Risk | Impact | Mitigation |
|---|---|---|
| Scope expansion | Core submission late | Keep drone as future work |
| Firmware/protocol mismatch | Integration failure | Inspect actual firmware before integration |
| Network instability | Commands/responses fail | Timeouts, validation, connection-state display |
| Voice recognition noise | Unreliable voice commands | Keep manual controls available |
| Missing localization hardware | Position cannot be verified | Treat localization as conditional future work |
| Unsafe movement | Hardware/environment damage | Safe stop, controlled tests, wheels raised during initial tests |
| Security gaps | Unauthorized control | Do not expose prototype publicly without access control |

## Definition of done
Each deliverable must have a source artefact, purpose, verification approach, and honest status (implemented, tested, planned, or future). Do not describe untested physical capabilities as verified.
