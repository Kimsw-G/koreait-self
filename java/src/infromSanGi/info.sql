-- create database ksw character set utf8;

-- create user 'kimsw'@'localhost' identified by '1234';
-- grant all privileges on ksw.* to 'kimsw'@'localhost';

-- use ksw;
create database ksw;

use ksw;

-- table 생성
create table workprocess(
    name varchar(10) not null,
    fullname varchar(100),
    info varchar(200)
);



insert into workprocess (name, fullname, info) values
('3C','Customer,Company,Copetitor','오마에겐이치. 표적시장 선정'),
('5-force',NULL,'마이클 포터. 5가지 요인 분석. 주변환경요인 분석'),
('6시그마','definition measure analyze improve control','모토로라 생산현장 무결성'),
('7s','Strategy System Structure Sharedvalue Skill Staff Style','7가지 요소 분석'),
('BI','Business Intelligence','경영활동 분석,제공. 어플리케이션'),
('BPM','Business Process Management','사람 및 정보 자원 효율적 관리'),
('BPO','Business Process Outsourcing','외부 위탁업체 이용. 자원 활용 극대화 및 역량 극복'),
('BPR','Business Process Reengineering',' 프로세스 기반 재설계. 현행 프로세스 분석. 개선사항 분석.향후 업무 분석. 이행계획'),
('BRMS','Business Rule Management System','복잡한 업무시스템 자동화'),
('CFS','Critical Sucess Factor', 'MIT개발. 성공 불가결 요인 찾기'),
('COP','Communities of Practice','지식공동체. 정보 경험을 서로 공유. 새로운 정보 창출'),
('CPM','Corporate Performance Management', '기업 성과 관리.최적 의사결정 관리'),
('CRM','Customer Relationship Management','고객 요구, 의견분석, 성향, 욕구 충족 마케팅'),
('CKO','Chief Knowledge Officer','최고 책임자. KMS 관리'),
('DSS','Decision Support System','주관적 사항들에 대해 효과적 의사결정 자원'),
('ERP','Enterprise Resource Planning','프로세스 통합.재구축. 신속한 의사결정 및 업무'),
('EAI','Enterprise Application Integration','여러 종류 플랫폼 통합. 여러 시스템간 실시간 정보조회 가능'),
('EIP','Enterprise Information Portal','기업 내부 요소 통합.'),
('EKP','Enterprise Knowledge Portal','기업 지식 포탈'),
('EDMS','Electronic Documnet Management System','전자문서를 효율적으로 관리하기 위함. 조회,검색'),
('EA','Enterprise Architecture','전사적 아키텍쳐. 구상.구현.밑그림'),
('IRM','Information Resource Management','정보 자원 관리'),
('ISP','Information Strategy Planning','기업수립 목표를 효과적으로 지원하기 위한 전략'),
('ITSM','IT Service Management','계획,설계,제공 운영. 사용자 요구 서비스에 초점. 프로세스,인력,조직,기술'),
('ITIL','IT Instructive Library','운영 및 관리를 돕는 문서집합')
('KMS','Knowledge Mnagements System','기존 기업 정보시스템, 기업환경 중요도 부각'),
('MDM','Master Data Management','마스터 데이터 단일화'),
('MOT','Management of Technology','기업 경쟁력 강화를 위한 기술경영을 통합. 스탠퍼드 밀러교수'),
('PI','Process Inovation','업무혁신'),
('PLM','Production LifeCycle Management','제품 수명 관리'),
('RTE','Real Time Enterprise','실시간 업무처리. 의사결정 빠름'),
('SCE','Supply Chain Execution','SCM 흐름 관리'),
('SCM','Supply Chain Management','최초 생산자-최종 소비자 공급망 관리. 불필요 비용 감축'),
('SCP','Supply Chain Planning','SCM 계획'),
('SEM', 'Strategic EnterPrise Management','합리적 의사결정 시스템'),
('SIS','Strategic Information System','경쟁 우위 확보. 1985년'),
('SLA','Service Level Agrement','사업자,사용자 간의 계약'),
('SLM','Service Level Management','SLA를 관리'),
('SRM','Supplier Relationship Management','공급 업체 관리'),
('SWOT','Strength Weakness Opportunity Threat','알버트 험프리. 기업 요인들을 분석. 마케팅 환경 모니터링'),
('VOC','Voice of Customer','고객의 목소리'),
('VRM','Vender Relationshop Management','개인 정보를 기업에서 관리하는 기법'),
('WBS','Work BreakDown Structure','프로젝트를 여러개의 단위로 나누어 기술'),
('벤치마킹',NULL,'특정분야 우수 롤모델 분석-개선');


create table seq(
    name varchar(10) not null,
    info varchar(200)
);

insert into workprocess (name, fullname, info) values
('기밀성','인가된 사용자에게만 접근이 허용됨'),
('무결성','인가된 사용자만 수정이 가능합'),
('가용성','인가받은 사용자는 언제라도 사용가능함'),
('인증','사용자를 식별하고 접근권한 검증'),
('부인방지','송/수신자가 송/수신 사실을 부인할 수 없도록 증거를 제공'),
('접근통제','불법적인 접근을 방지하는 과정'),
('DES','데이터 암호화 표준으로 대표적인 비밀키 암호화 기법이다. 미국 국방성. 암호화키=복호화키'),
('PKI','공개키 암호 시스템을 안전하게 사용하고 관리하기 위한 정보 보호 표준 방식이다. X.509, 비X.509 방식으로 구분'),
('QDK','양자 통신을 위해 비밀키를 분배하고 관리하는 기술'),
('XSS','네트워크를 통한 컴퓨터 보안 공격의 하나로, 웹페이지의 내용을 사용자 브라우저에 표현하기 위해 사용하는 스크립트에서 악용될 수 있는 취약점이나 해킹기법'),
('Hash','임의의 길이의 입력 데이터나, 메세지를 고정된 길이의 값이나 키로 변환하는 것을 말한다'),
('프라이버시 강화 기술','개인 정보 침해 위험을 관리하기 위한 핵심 기술. 암호화, 익명화 등 개인 정보를 보호하는 기술에서 다양한 프라이버시 보호기술을 통칭'),
('디지털 포렌식','저장매체에 존재하는 디지털 정보를 수집'),
('DRM')