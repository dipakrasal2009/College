# Create a data frame with the given data
data <- data.frame(
  Year = c(2001, 2002, 2003),
  Export = c(26, 32, 35),
  Import = c(35, 40, 50)
)

# Create a bar plot
barplot(as.matrix(data[, 2:3]), 
        beside = TRUE, 
        names.arg = data$Year, 
        col = c("blue", "red"),
        legend.text = c("Export", "Import"),
        main = "Export and Import from 2001 to 2003",
        xlab = "Year",
        ylab = "Amount (in billions)",
        ylim = c(0, 60))

# Add a grid for better visualization
grid()

