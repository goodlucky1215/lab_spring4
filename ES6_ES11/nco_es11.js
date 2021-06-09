//Nullish coalescing operator - 널 병합 연산자
// https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Operators/Nullish_coalescing_operator
// ||은 0,''을 false로 취급한다. 대신 ??은 값이 있기만 하다면 들어가서 0,''을 그대로 출력시킨다.
{
  {
    const name = 'jiny';
    const ueserName = name || 'Guest';
    console.log(ueserName); //jiny
  }
  {
    const name = null;
    const ueserName = name || 'Guest';
    console.log(ueserName); //Guest
  }
  {
    const name = '';
    const ueserName = name || 'Guest';
    console.log(ueserName); //Guest
  }
  {
    const name = 0;
    const ueserName = name || 'Guest';
    console.log(ueserName); //Guest
  }
  //문제 해결 구간
  {
    const name = 'ㅎㅎㅎㅎ';
    const ueserName = name ?? 'Guest';
    console.log(ueserName); //jiny
  }
  {
    const name = null;
    const ueserName = name ?? 'Guest';
    console.log(ueserName); //Guest
  }
  {
    const name = '';
    const ueserName = name ?? 'Guest';
    console.log(ueserName); //빈값이 들어옴.
  }
  {
    const name = 0;
    const ueserName = name ?? 'Guest';
    console.log(ueserName); //0
  }
}