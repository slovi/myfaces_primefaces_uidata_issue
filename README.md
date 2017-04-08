# primefaces_bugs

Test application for replicate primefaces issues.

To run application:

`mvn clean package`

Deploy war to your favourite server container/application server.

If you are not able to download the latest primefaces version (release candidates etc.) because of this error:

`unable to find valid certification path to requested target`

Export the DST Root CA3.cert into your JRE cacerts file (located in $JAVA_HOME/JRE/lib/security). The command is:

`keytool --importcert -file /Users/jirislovak/dev/DST\ Root\ CA\ X3.cer -keystore cacerts`

Issue list:
* bug1 - https://github.com/primefaces/primefaces/issues/1654
* bug2 - https://github.com/primefaces/primefaces/issues/2248
* bug3 - https://github.com/primefaces/primefaces/issues/2250