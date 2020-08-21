FROM openjdk:11-jdk

# This Dockerfile adds a non-root user with sudo access. Use the "remoteUser"
# property in devcontainer.json to use it. On Linux, the container user's GID/UIDs
# will be updated to match your local UID/GID (when using the dockerFile property).
# See https://aka.ms/vscode-remote/containers/non-root-user for details.
ARG USERNAME=dtrifuno
ARG USER_UID=1000
ARG USER_GID=$USER_UID

ARG GRADLE_VERSION=6.5
ARG GRADLE_BIN=/opt/gradle/gradle-${GRADLE_VERSION}/bin
ENV PATH ${PATH}:$GRADLE_BIN


# Configure apt
ENV DEBIAN_FRONTEND=noninteractive
RUN apt-get update \
    && apt-get -y install --no-install-recommends apt-utils dialog 2>&1 \
    # Create a non-root user to use if preferred - see https://aka.ms/vscode-remote/containers/non-root-user.
    && groupadd --gid $USER_GID $USERNAME \
    && useradd -s /bin/bash --uid $USER_UID --gid $USER_GID -m $USERNAME \
    # [Optional] Add sudo support for the non-root user
    && apt-get install -y sudo \
    && echo $USERNAME ALL=\(root\) NOPASSWD:ALL > /etc/sudoers.d/$USERNAME\
    && chmod 0440 /etc/sudoers.d/$USERNAME \
    #
    # Verify git, needed tools installed
    && apt-get -y install git openssh-client less iproute2 procps curl lsb-release
    #
    # Install Gradle
    RUN mkdir /opt/gradle
    RUN curl -L https://services.gradle.org/distributions/gradle-${GRADLE_VERSION}-bin.zip > gradle.zip; \
    mkdir /opt/gradle; \
    unzip -d /opt/gradle gradle.zip ; \
    rm gradle.zip; 
    #
    # Clean up
    RUN apt-get autoremove -y \
    && apt-get clean -y \
ENV DEBIAN_FRONTEND=dialog
