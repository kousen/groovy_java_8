package datetime

import java.time.*

ZoneId.availableZoneIds
      .findAll { it ==~ /.*Antarctica.*/ }
      .collect { Instant.now().atZone(ZoneId.of(it)) }
      .sort { it.offset.totalSeconds }
      .each { zdt -> println "$zdt.offset $zdt.zone" }