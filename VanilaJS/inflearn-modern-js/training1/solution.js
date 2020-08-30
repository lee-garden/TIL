/**
 * 실습예제1
 * filter, includes, from을 사용해서 문자열 'e'가 포함된
 * 노드로 구성된 배열을 만들어서 반환 하기
 */

const liList = document.querySelectorAll("li");

function init() {
  console.log(liList);
  let arrayFromNodeList = Array.from(liList);

  let resultArray = arrayFromNodeList.filter(function (value) {
    return value.innerText.includes("e");
  });

  console.log(resultArray);
}

init();
