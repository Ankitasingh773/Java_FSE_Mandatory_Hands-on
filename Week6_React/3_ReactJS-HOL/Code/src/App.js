import { CalculateScore } from './Components/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore 
        Name="Ankita Kumari Singh"
        School="Jaycees Secondary English Boarding School"
        total={284}
        goal={3}
      />
    </div>
  );
}

export default App;
