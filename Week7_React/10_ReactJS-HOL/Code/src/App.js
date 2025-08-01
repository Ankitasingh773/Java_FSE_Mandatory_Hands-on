import React from 'react';
import './App.css'; 
function App() {
  const element = "Office Space";

  const jsxatt = (
    <img src="/image/Office_Space_image.jpg" width="25%" height="25%" alt="Office Space" />
  );

  
  const itemName = {
    Name: "DBS",
    Rent: 50000, 
    Address: "Chennai"
  };

  
  let rentColorClass = ''; 
  if (itemName.Rent <= 60000) {
    rentColorClass = 'textRed'; 
  } else {
    rentColorClass = 'textGreen'; 
  }

  return (
    <div className="App">
      {/* Heading of the page */}
      <h1>
        {element} , at Affordable Range
      </h1>

      {/* Image of the office space */}
      {jsxatt}

      {/* Display office details */}
      <h3>Name: {itemName.Name}</h3>

      {/* Display Rent with conditional styling */}
      <h3>
        Rent: Rs. <span className={rentColorClass}>{itemName.Rent}</span>
      </h3>

      {/* Display Address */}
      <h3>Address: {itemName.Address}</h3>
    </div>
  );
}

export default App;
