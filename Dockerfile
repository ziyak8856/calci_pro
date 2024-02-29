
FROM openjdk:17
COPY ./target/calci_pro-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java","-cp","calci_pro-1.0-SNAPSHOT.jar","org.example.Main"]