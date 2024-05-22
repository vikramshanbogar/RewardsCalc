# RewardsCalc



Implemented SSL: https://www.baeldung.com/spring-boot-https-self-signed-certificate

` keytool -genkeypair -alias baeldung -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore baeldung.p12 -validity 3650`


to access the https service import the public key, placed in the keystore for reference.
baeldung_public_certificate.cer