import React, { useState } from 'react';

function CurrencyConvertor() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');

  const handleAmountChange = (event) => {
    setAmount(event.target.value);
  };

  const handleCurrencyChange = (event) => {
    setCurrency(event.target.value);
  };

  const handleSubmit = (event) => {
    event.preventDefault();

    const parsedAmount = parseFloat(amount);

    if (isNaN(parsedAmount)) {
      alert("Please enter a valid number for Amount.");
      return;
    }

    if (currency.toLowerCase() === 'euro') {
      const convertedRupees = parsedAmount * 90;
      alert(`Converting to Euro: Amount is ${convertedRupees.toFixed(2)} INR`);
    } else if (currency.toLowerCase() === 'inr') {
      const convertedEuro = parsedAmount / 90;
      alert(`Converting to INR: Amount is ${convertedEuro.toFixed(2)} Euro`);
    } else {
      alert("Please specify 'Euro' or 'INR' as the currency for conversion.");
    }
  };

  return (
    <div className="currency-converter">
      <h2>Currency Convertor!!!</h2>
      <form onSubmit={handleSubmit}>
        <div>
          <label htmlFor="amount-input">Amount:</label>
          <input
            type="text"
            id="amount-input"
            value={amount}
            onChange={handleAmountChange}
            placeholder="e.g., 100"
          />
        </div>
        <div>
          <label htmlFor="currency-input">Currency:</label>
          <input
            type="text"
            id="currency-input"
            value={currency}
            onChange={handleCurrencyChange}
            placeholder="e.g., Euro or INR"
          />
        </div>
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default CurrencyConvertor;