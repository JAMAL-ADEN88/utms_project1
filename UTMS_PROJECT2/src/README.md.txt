
# University Transport Management System (UTMS) – Java OOP Project

## 👤 Author  
Name:Jamal 
Registration No: VU-BIT-2407-2225-DAY  
Faculty: Science and Technology  
Course: Object-Oriented Programming

---

## 📘 Project Overview

This project simulates a **University Transport Management System (UTMS)** designed for Victoria University. It provides functionality to manage transport requests for Students, Lecturers, and Transport Officers, as well as interactions with Drivers and Vehicles. The system demonstrates full implementation of **Object-Oriented Programming (OOP)** principles using Java.

---

## 🎯 Objectives

- Apply OOP principles to solve a real-world problem.
- Demonstrate abstraction, encapsulation, inheritance, polymorphism, and overloading.
- Simulate transport requests and behaviors using a simple command-line application.

---

## 🧱 OOP Concepts Used

### 1. 🔒 **Encapsulation**
- **Implemented In**: `Driver.java`
- Driver’s `name` and `licenseNumber` are private and accessed via getter/setter methods.
- **Purpose**: Protect internal object state from direct external access.

### 2. 🧬 **Inheritance**
- **Implemented In**: `Student`, `Lecturer`, `TransportOfficer` → Inherit from abstract `User` class.
- **Purpose**: Reuse common code and create specialized user behaviors.

### 3. 🎭 **Polymorphism (Overriding)**
- Each subclass overrides `requestTransport()` to provide different transport needs.
- **Demonstrated In**: `MainApp.java` via runtime polymorphism.

### 4. 🧩 **Abstraction**
- `User` is an abstract class that defines a general template for users.
- Interfaces like `Trackable`, `Serviceable`, and `Schedulable` define vehicle behaviors.
- **Purpose**: Hide implementation details, expose only required operations.

### 5. 🔁 **Method Overloading**
- `assignDriver()` method is overloaded in `TransportService.java`:
  - One version takes `vehicleType`.
  - Another takes both `vehicleType` and `shiftTime`.

---

## 🧪 Features Demonstrated in Output

- Display of student names and registration numbers.
- Execution of overridden methods by user type.
- Encapsulated driver details.
- Interface implementation for vehicle behaviors.
- Overloaded method for assigning drivers based on vehicle or shift time.

---

## 🏁 How to Run

1. Open Apache NetBeans.
2. Create a new Java project and name it `UTMS`.
3. Inside `src/utms`, add all `.java` files:
   - `User.java`, `Student.java`, `Lecturer.java`, `TransportOfficer.java`
   - `Driver.java`, `Bus.java`, `Van.java`
   - `Trackable.java`, `Serviceable.java`, `Schedulable.java`
   - `TransportService.java`, `MainApp.java`
4. Right-click `MainApp.java` > **Run File**.

---

## ✅ Output Example

```

\--- User Transport Requests ---
Student: JAMAL | Reg No: VU-BIT-2407-2225-DAY is requesting transport to the hostel.
Lecturer: MR alex Bazigu | ID: L101 is requesting transport to the seminar.
Transport Officer: Mr. Denis | ID: T005 is coordinating transport assignments.

\--- Driver Information (Encapsulation) ---
Driver Name: James
License No: DL-9987-UG

\--- Vehicle Behaviors (Interfaces) ---
Bus: GPS location tracked.
Bus: Maintenance service performed.
Van: Real-time location tracked via mobile network.

\--- Driver Assignment (Method Overloading) ---
Assigning a driver for vehicle type: Bus
Assigning driver for Van during Morning shift.

```

---

## 📎 Folder Structure

```

UTMS/
├── src/
│   └── utms/
│       ├── MainApp.java
│       ├── User.java
│       ├── Student.java
│       ├── Lecturer.java
│       ├── TransportOfficer.java
│       ├── Driver.java
│       ├── Bus.java
│       ├── Van.java
│       ├── TransportService.java
│       ├── Trackable.java
│       ├── Serviceable.java
│       └── Schedulable.java
└── README.md

```

---

## 🔚 Conclusion

This Java OOP project for UTMS demonstrates real-world use of object-oriented concepts in a simple, testable form. It can easily be expanded in the future to include a database, login system, or GUI.

```

---



