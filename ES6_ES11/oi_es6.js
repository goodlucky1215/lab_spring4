// Object Initializer
// https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Operators/Object_initializer
{
 const person = {
   name: 'jiny',
   age:  '19',
 };

 const name = 'ariel';
 const age = '23'

 const person2 = {
   name: name,
   age: age,
 };

 // key와 value가 동일 할 때는 생략이 가능하다.
 const person3 = {
   name,
   age,
 }

 console.log(person, person2, person3);
}