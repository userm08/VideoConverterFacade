# Assignment #4 — Facade Pattern (Software Design Patterns)

## 1. Project Overview
This project implements the **Facade** structural design pattern in Java (JDK 17). It provides a simplified interface (`VideoConversionFacade`) to wrap a complex subsystem consisting of video file handling, codec extraction, bitrate reading, and audio mixing.

## 2. Architecture & Subsystem Components
* **Facade**: `VideoConversionFacade` — coordinates the subsystem classes in the correct order.
* **Subsystem**:
    * `VideoFile` — parses and stores video file metadata.
    * `Codec` & Codec Implementations (`OggCompressionCodec`, `MPEG4CompressionCodec`) — handle compression types.
    * `CodecFactory` — extracts the appropriate codec based on file format.
    * `BitrateReader` — reads and converts file buffers.
    * `AudioMixer` — fixes and finalizes the audio track.
* **Client**: `Main` — interacts exclusively with the Facade.

## 3. UML Class Diagram
*(The UML class diagram illustrating the relationship between Client, Facade, and Subsystem classes is included in the formal report document submitted to LMS).*

## 4. Clean Code Principles Applied
1. **Meaningful Names**: Self-explanatory class and method names.
2. **Single Responsibility Principle**: Facade focuses on coordination, subsystem classes handle specific logic.
3. **No Leaking of Subsystem Details**: Internal subsystem classes are hidden behind a clean public method.
4. **Small, Focused Classes**: Subsystem components are isolated and responsible for single operations.
5. **Encapsulation of Creation Logic**: Codec selection is isolated within the factory component.

## 5. Deliverables & Execution
* Compiling Java project structure.
* Successfully running client (`Main.java`).