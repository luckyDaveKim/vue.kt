# VueJS & Kotlin (Vue.kt) Starter
본 프로젝트는 Vue.js와 Kotlin 기반의 web 프로젝트(Vue.kt) 입니다.

## 개요
Vue.kt는 Vue.js와 Kotlin을 사용하여 손쉽에 web 프로젝트를 시작할 수 있도록 '할 일 관리' 예제를 구현하였습니다.

![ScreenShot](./doc/example.gif)

## 기술 스택
Vue.kt에서 사용한 기술은 다음과 같습니다.

### Front-End
#### [Vue.js](https://kr.vuejs.org/)
Vue.js는 웹 어플리케이션의 사용자 인터페이스를 만들기 위해 사용하는 오픈 소스 프로그레시브 자바스크립트 프레임워크입니다.

#### [BootStrap](https://getbootstrap.com/)
BootStrap은 웹사이트를 쉽게 만들 수 있게 도와주는 HTML, CSS, JS 프레임워크입니다.  
하나의 CSS로 스마트폰, 테블릿, 데스크탑까지 다양한 기기에서 사용 가능하도록 반응형 디자인을 제공합니다. 

#### LocalStorage
LocalStorage는 클라이언트 측에 데이터 저장을 할 수 있는 객체이며, 세션이 종료되어도 저장된 데이터가 삭제되지 않는 장점이 있습니다.

## 실행 방법
### Front-End
Front-End 실행 방법은 다음과 같습니다.
```
cd frontend
```

#### 서비스 실행
서비스 실행 시 3000 포트로 서비스가 올라옵니다.
```
npm run serve
```

#### 빌드
```
npm run build
```

#### lint
```
npm run lint
```