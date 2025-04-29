FROM openjdk:25-jdk
RUN mkdir /app

# Copy all compiled classes
COPY out/production/Assignment/ /tmp

# Create and set working directory
WORKDIR /tmp



# Run one question at a time (choose which to execute)
CMD ["java", "controller.MainMenu"]





