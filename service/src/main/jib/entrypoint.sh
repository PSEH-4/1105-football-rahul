#!/bin/sh

echo "The application will start in ${SAPIENT_SLEEP}s..." && sleep ${SAPIENT_SLEEP}
exec java ${JAVA_OPTS} -noverify -XX:+AlwaysPreTouch -Djava.security.egd=file:/dev/./urandom -cp /app/resources/:/app/classes/:/app/libs/* "com.sapient.service.ServiceApplication"  "$@"
