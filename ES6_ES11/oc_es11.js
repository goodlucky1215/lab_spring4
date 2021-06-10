//Optional Chaining
// https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Operators/Optional_chaining
{
  const worker1 = {
    name: 'jiny',
    job: {
      title:'Front Engineer',
      manager:{
        name: 'king',
      },
    }
  };
  const worker2 = {
    name: 'King',
  };
  {
    function print(worker){
      console.log(worker.job && worker.job.manager && worker.job.manager.name);
    }
    print(worker1);
    print(worker2);
  }
  {
    function print(worker){
      console.log(worker.job
                  ? worker.job.manager
                    ? worker.job.manager.name
                    :undefined
                  :undefined
                  );
      //worker.job ? (worker.job.manager ? worker.job.manager.name :undefined) :undefined
    }
    print(worker1);
    print(worker2);
  }
  {//추천
   //?.은 ?.'앞’의 평가 대상이 undefined나 null이면 평가를 멈추고 undefined를 반환합니다
    function print(worker){
      console.log(worker.job?.manager?.name);
    }
    print(worker1);
    print(worker2);
  }
}