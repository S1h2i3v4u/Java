#  Profit or Loss Calculator (Java)

This is a simple Java console-based application that calculates **Profit**, **Loss**, or **No Profit No Loss** based on **Cost Price (CP)** and **Selling Price (SP)** entered by the user.

---

##  Features

- Takes input for:
  - Cost Price (CP)
  - Selling Price (SP)
- Calculates:
  - Profit and Profit Percentage
  - Loss and Loss Percentage
- Displays the result with appropriate message

---

##  Logic Used

- **Profit** if SP > CP  
  `Profit = SP - CP`

- **Loss** if CP > SP  
  `Loss = CP - SP`

- **No Profit No Loss** if SP == CP

---

##  How to Run

1. Save the file as `ProfitLoss.java`
2. Compile the program using:

   ```bash
   javac ProfitLoss.java
