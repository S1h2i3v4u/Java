# Profit or Loss Calculator – Java (Static Version)

This is a simple Java program that calculates **Profit**, **Loss**, or **No Profit No Loss** using hardcoded values of **Selling Price (SP)** and **Cost Price (CP)**.

---

## Features

- Calculates:
  - Profit if SP > CP
  - Loss if CP > SP
  - No Profit No Loss if SP == CP
- Simple and easy-to-understand logic using `if-else` conditions

---

## Logic Used

```java
if (SP > CP)
    Profit = SP - CP
else if (CP > SP)
    Loss = CP - SP
else
    No Profit No Loss
