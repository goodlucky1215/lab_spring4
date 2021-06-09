// https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Operators/Destructuring_assignment
{
  const sonata = {
    carColor : 'black',
    wheelNum : 4,
    speed : 40,
  };
  //방법1
  {
  const carColor = sonata.carColor;
  const speed = sonata.speed;
  const wheelNum = sonata.wheelNum;
  }
  //방법2 - 추천!!
  {
  const { carColor, wheelNum, speed } = sonata;
  console.log(carColor, wheelNum, speed);

  const {carColor: sonataColor, wheelNum: sonataWheelNum, speed: sonataSpeed } = sonata;
  console.log(sonataColor, sonataWheelNum, sonataSpeed);
  }
  //방법 1 - array - 배열에서는 대괄호 사용함.
  const food = ['🍜','☕'];
  {
    const one = food[0];
    const two = food[1];
    console.log(one, two);
  }

  //방법 2 - 추천
  {
    const [one, two] = food;
    console.log(one, two);
  }
}