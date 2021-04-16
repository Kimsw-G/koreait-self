-- create database ksw character set utf8;

-- create user 'kimsw'@'localhost' identified by '1234';
-- grant all privileges on ksw.* to 'kimsw'@'localhost';

-- use ksw;
create database ksw;

use ksw;

-- table 생성
create table workprocess(
    name varchar(10) not null,
    fullname varchar(200),
    info varchar(200)
);



insert into workprocess (name, fullname, info) values
('3C','Customer,Company,Copetitor','오마에겐이치. 표적시장 선정'),
('5-force',NULL,'마이클 포터. 5가지 요인 분석. 주변환경요인 분석'),
('6시그마','definition measure analyze improve control','모토로라 생산현장 무결성'),
('7s','Strategy System Structure Sharedvalue Skill Staff Style','7가지 요소 분석'),
('BI','Business Intelligence-비즈니스 인텔리전스','경영활동 분석,제공. 어플리케이션'),
('BPM','Business Process Management-업무 프로세스 관리','사람 및 정보 자원 효율적 관리'),
('BPO','Business Process Outsourcing','외부 위탁업체 이용. 자원 활용 극대화 및 역량 극복'),
('BPR','Business Process Reengineering-업무 프로세스 재설계',' 프로세스 기반 재설계. 현행 프로세스 분석. 개선사항 분석.향후 업무 분석. 이행계획'),
('BRMS','Business Rule Management System-비즈니스 규칙 관리 시스템','복잡한 업무시스템 자동화'),
('CFS','Critical Sucess Factor', 'MIT개발. 성공 불가결 요인 찾기'),
('COP','Communities of Practice-지식공동체',' 정보 경험을 서로 공유. 새로운 정보 창출'),
('CPM','Corporate Performance Management', '기업 성과 관리.최적 의사결정 관리'),
('CRM','Customer Relationship Management-고객 관계 관리','고객 요구, 의견분석, 성향, 욕구 충족 마케팅'),
('CKO','Chief Knowledge Officer-지식 경영 최고 책임자','최고 책임자. KMS 관리'),
('DSS','Decision Support System-의사 결정 지원 시스템','주관적 사항들에 대해 효과적 의사결정 자원'),
('EA','Enterprise Architecture-전사적 아키텍쳐','IT 인프라 각 부분의 구상.구현.밑그림'),
('ERP','Enterprise Resource Planning-전사적 자원관리','프로세스 통합.재구축. 신속한 의사결정 및 업무'),
('ERM','Enterprise Risk Management-전사적 위험관리','기업의 궁극적 목표 달성을 위해 직면중인 주요 리스크 식별,관리'),
('EAI','Enterprise Application Integration-전사적 응용 통합','여러 종류 플랫폼 통합. 여러 시스템간 실시간 정보조회 가능'),
('EIP','Enterprise Information Portal-기업 정보 포털','기업 내부 요소 통합.'),
('EKP','Enterprise Knowledge Portal','기업 지식 포탈'),
('EDMS','Electronic Documnet Management System-전자 문서 관리 시스템','전자문서를 효율적으로 관리하기 위함. 조회,검색'),
('IRM','Information Resource Management-정보 자원 관리','정보 자원 관리'),
('ISP','Information Strategy Planning','기업수립 목표를 효과적으로 지원하기 위한 전략'),
('ITSM','IT Service Management','계획,설계,제공 운영. 사용자 요구 서비스에 초점. 프로세스,인력,조직,기술'),
('ITIL','IT Instructive Library','운영 및 관리를 돕는 문서집합'),
('KMS','Knowledge Mnagements System-지식 관리 시스템','기존 기업 정보시스템, 기업환경 중요도 부각'),
('MDM','Master Data Management-기준 정보 관리','마스터 데이터 단일화를 통해 오류 감소,활용도 증가'),
('MOT','Management of Technology-기술 경영','기업 경쟁력 강화를 위한 기술경영을 통합. 스탠퍼드 밀러교수'),
('PI','Process Inovation-업무 혁신','최적의 프로세스 재구축. 업무 효율성 증가'),
('PLM','Production LifeCycle Management-제품 수명주기 관리','기업이 제품의 원가를 낮추고, 부가가치 증가를 위해 제품의 수명을 관리'),
('RTE','Real Time Enterprise-실시간 기업','실시간 업무처리. 의사결정 빠름'),
('SCE','Supply Chain Execution','SCM 흐름 관리'),
('SCM','Supply Chain Management-공급망 관리','최초 생산자-최종 소비자 공급망 관리. 불필요 비용 감축'),
('SCP','Supply Chain Planning','SCM 계획'),
('SEM', 'Strategic EnterPrise Management-전략적 기업경영','합리적 의사결정 시스템'),
('SIS','Strategic Information System-전략 정보 시스템','경쟁 우위 확보. 1985년'),
('SLA','Service Level Agrement','사업자,사용자 간의 계약'),
('SLM','Service Level Management','SLA를 관리'),
('SRM','Supplier Relationship Management-공급업체 관계 관리','공급 업체 관리'),
('SWOT','Strength Weakness Opportunity Threat','알버트 험프리. 기업 요인들을 분석. 마케팅 환경 모니터링'),
('VOC','Voice of Customer-고객의 목소리','고객의 서비스 수준 향상. 콜센터,인터넷 이용'),
('VRM','Vender Relationshop Management-밴더 관계 관리','개인 정보를 기업에서 관리하는 기법'),
('ValueChain','가치사슬','고객에게 가치를 제공하는 기업의 활동을 관리'),
('WBS','Work BreakDown Structure','프로젝트를 여러개의 단위로 나누어 기술'),
('벤치마킹',NULL,'특정분야 우수 롤모델 분석-개선');


create table seq(
    name varchar(50) not null,
    fullname varchar(100),
    info varchar(200)
);

insert into workprocess (name, fullname, info) values
('기밀성',null,'인가된 사용자에게만 접근이 허용됨'),
('무결성',null,'인가된 사용자만 수정이 가능합'),
('가용성',null,'인가받은 사용자는 언제라도 사용가능함'),
('인증',null,'사용자를 식별하고 접근권한 검증'),
('부인방지',null,'송/수신자가 송/수신 사실을 부인할 수 없도록 증거를 제공'),
('접근통제',null,'불법적인 접근을 방지하는 과정'),
('DES','Data Encryption Standard-데이터 암호 표준','데이터 암호화 표준으로 대표적인 비밀키 암호화 기법이다. 미국 국방성. 암호화키=복호화키'),
('PKI','Public Key Ifrastructure-공개키 기반 구조','공개키 암호 시스템을 안전하게 사용하고 관리하기 위한 정보 보호 표준 방식이다. X.509, 비X.509 방식으로 구분'),
('QDK','Quantum key distribution-양자 암호키 분배','양자 통신을 위해 비밀키를 분배하고 관리하는 기술'),
('XSS','Cross site Scripting-크로스 사이트 스크립팅','네트워크를 통한 컴퓨터 보안 공격의 하나로, 웹페이지의 내용을 사용자 브라우저에 표현하기 위해 사용하는 스크립트에서 악용될 수 있는 취약점이나 해킹기법'),
('Hash',null,'임의의 길이의 입력 데이터나, 메세지를 고정된 길이의 값이나 키로 변환하는 것을 말한다'),
('PET','Privacy Enhancing Technology-프라이버시 강화기술','개인 정보 침해 위험을 관리하기 위한 핵심 기술. 암호화, 익명화 등 개인 정보를 보호하는 기술에서 다양한 프라이버시 보호기술을 통칭'),
('디지털 포렌식','Digital Forensics-디지털 포렌식','저장매체에 존재하는 디지털 정보를 수집'),
('DRM','Digital Rights Management-디지털 저작권 관리','안전 배포 활성화, 불법 배포 방지. 기타 디지털 매체를 통해 유통되는 데이터 저작권 보호 시스템'),
('ONS','Object Naming Service-','사물에 관한 구체적인 정보가 저장된 서버를 알려주는 서비스. 초기 제작정보 및 유통과정 정보등 파악 가능.'),
('IDS','Intrusion Detection System','컴퓨터 시스템의 비정상적 사용.오용.남용등을 탐지.'),
('RFID','Radio Frequency IDentification','라디오 주파수 인식기술. 개체 정보 관리 인식기술'),
('CopyRight',null,'원저작물의 창작자가 저작물의 사용, 배포에 권리를 인정하는 법적 권리'),
('CopyLeft',null,'저작권 기반 공유 주장. 저작권의 반대 개념. 지식.정보 독점 반대.'),
('DLP','Data Leakage/LossPrevention-데이터 유출 방지','내부정보 유출방지 솔루션. 사내 직원 사용 PC 검색,탐지,통제'),
('CC','Common Criteria-공통 평가 기준','1996년 6월 8일. ISO 15408표준 정보화 순기능 역할을 보장.정보보호 사용환경등급 기준'),
('SSL','Secure Socket Layer-','송수신 객체 사이에서 TCP/IP 계층과 어플리케이션 계층 사이에서 인증,암호화,무결성을 보장'),
('ProxyServer')