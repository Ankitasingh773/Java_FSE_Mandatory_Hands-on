import React from 'react';

function EvenPlayers({ players }) {
  const evenPlayers = players.filter((_, index) => index % 2 !== 0); // odd index = 2nd, 4th...
  return (
    <ul>
      {evenPlayers.map((player, index) => (
        <li key={index}>{player}</li>
      ))}
    </ul>
  );
}

export default EvenPlayers;
