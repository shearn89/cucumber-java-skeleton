CLASSPATH=lib/*
CLASSPATH=$CLASSPATH:src/test/resources
CLASSPATH=$CLASSPATH:target/classes
CLASSPATH=$CLASSPATH:target/test-classes

java \
    -classpath $CLASSPATH \
    cucumber.api.cli.Main \
    --format pretty \
    --format junit:target/cucumber-junit-report.xml \
    --format html:target/cucumber-html-report \
    --glue skeleton \
    src/test/resources
