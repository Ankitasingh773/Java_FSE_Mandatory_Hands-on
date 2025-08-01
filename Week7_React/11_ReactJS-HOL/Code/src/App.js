import React, { useState } from 'react';
import './App.css';
import CurrencyConvertor from './CurrencyConvertor';

function App() {
  const [count, setCount] = useState(0);

  const handleIncrementAndSayHello = () => {
    setCount(prevCount => prevCount + 1);
    alert("Hello followed by a static message.");
  };

  const handleDecrement = () => {
    setCount(prevCount => prevCount - 1);
  };

  const sayWelcome = (message) => {
    alert(message);
  };

  const handleClickMe = (event) => {
    alert("I was clicked");
    console.log(event);
  };

  return (
    <div className="App">
      <h1>Counter: {count}</h1>
      <div>
        <button onClick={handleIncrementAndSayHello}>Increment</button>
        <button onClick={handleDecrement}>Decrement</button>
        <button onClick={() => sayWelcome("welcome")}>Say Welcome</button>
        <button onClick={handleClickMe}>Click on me</button>
      </div>

      <hr />

      <CurrencyConvertor />
    </div>
  );
}

export default App;
