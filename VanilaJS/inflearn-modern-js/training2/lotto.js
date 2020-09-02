const SETTING = {
  name: "LOTTO!",
  count: 6,
  maxNumber: 45,
};

const lottoSet = new Set();

function getRandomNumber(maxNumber) {
  let lottoNumber = Math.floor(Math.random() * maxNumber + 1);
  while (lottoSet.has(lottoNumber)) {
    lottoNumber = Math.floor(Math.random() * maxNumber + 1);
  }
  lottoSet.add(lottoNumber);
}

for (let i = 0; i < SETTING.count; i++) {
  getRandomNumber(SETTING.maxNumber);
}

console.log(lottoSet);
