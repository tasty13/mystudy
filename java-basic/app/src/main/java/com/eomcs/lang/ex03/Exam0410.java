package com.eomcs.lang.ex03;

//# 문자의 리터럴
//- 작은 따옴표 ''를 사용하여 문자를 표현한다.

public class Exam0410 {
  public static void main(String[] args) {
    // 자바는 문자를 메모리에 저장할 때 Unicode 규칙에 따라
    // 2바이트 코드로 저장한다.
    // => 'A' : 0x0041
    // => 'B' : 0x0042
    // => '1' : 0x0031
    // => '가': 0xac00
    //
    // println()
    // - 출력 값으로 문자 코드가 주어지면 해당 코드의 문자를
    //   폰트 파일에서 찾아 출력한다.
    // - 만약 폰트 파일에 해당 코드의 문자가 없으면 출력하지 못한다.
    //
    //작은 따옴표를 사용하여 문자를 표현한다.
    System.out.println('A');
    System.out.println('가');

    // 직접 문자를 적는 대신에 그 문자에 부여된 코드 값을 지정할 수 있다.
    // 문자에 대해 부여된 값을 '문자 코드(character code)'라 부른다.
    // 코드 값은 사용하는 문자 집합에 따라 다르다.
    // 자바는 '유니코드(UTF-16BE; UCS2)' 라는 문자집합을 사용한다.
    // \ u 뒤에 문자에 부여된 코드 값을 16진수로 적는다.
    // u는 소문자로 적어야 한다.
    System.out.println('\u0041');  // A
    System.out.println('\uac00');  // 가
    System.out.println('\uAC00');  // 가 (16진수는 대소문자를 구분하지 않는다)

    // \ 바로 뒤에 8진수로 적을 수 있다.
    // 단, 0 ~ 377 범위의 8진수만 가능하다.
    System.out.println('\101'); // A
    System.out.println('\122'); // R
    System.out.println('\377'); // ÿ
    //System.out.println('\378'); // 컴파일 오류!

    // 유니코드 값을 직접 적는 경우는
    // 보통 키보드로 문자를 직접 입력할 수 없을 때이다.
    System.out.println('\u4eba'); // 사람을 뜻하는 '인(人)'이라는 한자의 문자 코드
    System.out.println('\u00a9'); // copyright를 뜻하는 '©' 문자 코드
    System.out.println('\u03c0'); // 수학의 파이 기호 'π'
    System.out.println('\u03a3'); // 수학의 시그마 기호 'Σ'
  }
}

// - 문자를 메모리에 저장하려면
//   2진수로 바꿀 수 있어야 한다.
// - 문자를 2진수로 바꾸는 규칙을
//   "문자집합(Character Set)"이라 한다.
// - 문자 집합에는 여러 규칙이 있다.
//   - 1) ASCII(7비트,American Standard Code for Information Interchange)
//     - 영어 대소문자, 숫자, 특수문자 등
//     - 'A' => 100_0001 = 0x41
//     - 'B' => 100_0010 = 0x42
//     - '1' => 011_0001 = 0x31
//     - '2' => 011_0002 = 0x32
//     - 한글(11172자)은 정의되어 있지 않다.
//   - 2) ISO-8859-1(8비트)
//     - ASCII 문자 + 유럽 문자
//   - 3) EUC-KR(16비트,KSC-5601)
//     - 한글 2350자에 대한 규칙
//     - '가' => 10110000_10100001 = 0xb0a1
//     - '각' => 10110000_10100010 = 0xb0a2
//     - 현대 통용되는 한글 음절 11172자를 모두 표현할 수 없다.
//   - 4) Unicode(16비트, ISO 10646)
//     - 영어, 한글 모두 2바이트로 표현
//     - 일반적으로 통용되는 대부분의 국가의 문자를 담고 있다
//     - 'A' => 0x0041
//     - 'B' => 0x0042
//     - '1' => 0x0031
//     - '2' => 0x0032
//     - '가' => 0xac00
//     - '각' => 0xac01
//     - 영어를 2바이트로 표현하기 때문에 비효율적이다.
//     - 한글은 새로 정의했기 때문에 EUC-KR과 호환되지 않는다.
//   - 5) UTF-8(Universal Coded Character Set Transformation Format, 8비트 ~ 32비트)
//     - Unicode에 있는 문자를 규칙에 따라 1 ~ 4바이트로 변환한다.
//     - ISO-8859-1(영어,숫자,특수문자): 1바이트로 표현한다.
//       - 'A' => 0x41
//       - 'B' => 0x42
//       - '1' => 0x31
//     - 한글: 3바이트로 표현한다.
//       - 1110xxxx 10xxxxxx 10xxxxxx
//       - '가' => 0xac00(10101100_00000000, Unicode)
//              => 1110xxxx 10xxxxxx 10xxxxxx (변환규칙)
//              => 11101010 10110000 10000000 (규칙에 값 적용)
//              => 0xEAB080(UTF-8)
//     - 문자에 따라 바이트 크기가 다르다.
//     - 기존의 ISO-8850-1 은 1바이트로 표현한다.
//     - 한글은 규칙에 따라 3바이트로 변환한다.
//
// 폰트
// 1) Raster 폰트(bitmap 폰트)
// - 크기를 늘리면 계단현상 발생
// - 폰트를 도트(점) 정보로 저장한다.
// - 출력 속도가 빠르다.
// - 단순한 그림이나 복잡한 그림이나 파일 크기가 같다.
// - 왜? 천연색일 경우 각 점을 3바이트로 표현하기 때문이다.
//
// 2) Vector 폰트(truetype 폰트)
// - 크기를 늘려도 깔끔하게 출력
// - 폰트를 명령어로 저장한다.(선의 종류, 좌표 등)
// - 그릴 때 마다 명령어를 실행해야 하기 때문에 출력 속도가 느리다.
// - 그림이 복잡할수록 명령어가 복잡하기 때문에 파일 크기가 커진다.