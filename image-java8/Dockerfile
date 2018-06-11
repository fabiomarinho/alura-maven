FROM ubuntu

RUN apt-get update \
    && apt-get install -y --no-install-recommends \
    software-properties-common

RUN add-apt-repository ppa:webupd8team/java

RUN apt-get update

RUN echo 'yes' | apt-get install -y --no-install-recommends \
    oracle-java8-installer

RUN apt-get install -y --no-install-recommends \
    oracle-java8-set-default

#RUN mkdir /maven
#ADD apache-maven-3.5.3-bin.tar.gz /maven        

#ENV MAVEN_HOME="/maven/apache-maven-3.5.3"

#ENV PATH="${PATH}:${MAVEN_HOME}/bin"