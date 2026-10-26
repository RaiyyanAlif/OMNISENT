# OMNISENT Requirements Specification
**Version:** 0.1 — proposed academic prototype

## Purpose
Define the expected behaviour and quality attributes for the initial OMNISENT software prototype. These are proposed requirements, not proof of implementation.

## Stakeholders
- Operator: issues commands and views status/history.
- Developer: designs, implements, tests, and documents the system.
- Instructor/evaluator: reviews Java concepts and software-engineering artefacts.
- Future maintainer: extends services and hardware integrations.

## Functional requirements
| ID | Requirement | Priority | Verification |
|---|---|---|---|
| FR-01 | Provide an operator interface for robot commands. | Must | Interface walkthrough |
| FR-02 | Represent forward, backward, left, right, and stop commands. | Must | Unit tests / controlled test |
| FR-03 | Represent connection state and report communication errors. | Must | Simulated disconnect |
| FR-04 | Send commands through a defined communication adapter. | Must | Mock adapter test |
| FR-05 | Represent status received from the robot controller. | Must | Status-message test |
| FR-06 | Create mission records with IDs, timestamps, and status. | Must | Unit tests |
| FR-07 | Associate command/event records with missions. | Should | Inspect event log |
| FR-08 | Support a replaceable camera-capture service. | Should | Mock or camera integration |
| FR-09 | Allow integration with Python voice/vision services. | Should | Service-contract test |
| FR-10 | Provide a path to server-side storage and phone-friendly status access. | Future | Design review |
| FR-11 | Allow future localization, obstacle avoidance, mapping, and drone integration. | Future | Architecture review |

## Non-functional requirements
- Maintainability: clear class responsibilities.
- Extensibility: interfaces isolate service implementations.
- Reliability: timeouts and explicit error states.
- Usability: clear controls and connection state.
- Safety: stop behaviour and safe motor state considered before hardware testing.
- Security: authentication/access control before remote deployment.
- Data integrity: consistent identifiers and timestamps.
- Testability: core logic testable without physical hardware.

## Constraints and assumptions
- Existing platform is understood to include an Arduino-compatible Mega and ESP8266 bridge; actual firmware protocol must be verified before integration.
- Python voice/camera services may be reused, subject to integration testing.
- The initial prototype is not expected to deliver full autonomy.
- GPS, LiDAR, and drone hardware availability is not assumed.
- Server-side storage and phone access are proposed features requiring deployment and network decisions.

## Out of scope for initial prototype
- Fully autonomous navigation in arbitrary environments.
- Certified safety or public-space deployment.
- Drone flight control and ground-air coordination.
- Full humanoid mechanical body.
- GPS positioning claims without compatible hardware and tests.
