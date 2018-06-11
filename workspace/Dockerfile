FROM java8

RUN mkdir /maven
ADD apache-maven-3.5.3-bin.tar.gz /maven        

ENV MAVEN_HOME="/maven/apache-maven-3.5.3"

ENV PATH="${PATH}:${MAVEN_HOME}/bin"