plugins {
	kotlin("jvm") version "1.9.22"
	id("fabric-loom") version "1.5-SNAPSHOT"
	id("legacy-looming") version "1.5-SNAPSHOT"
}

// use 8 for higher compatibility
val jvmVer = 17

version = project.version
group = project.group

dependencies {
	minecraft("com.mojang:minecraft:1.8.9")
	mappings(legacy.yarn("1.8.9", "535"))

	modImplementation("net.fabricmc:fabric-loader:0.15.6")
	modImplementation("net.legacyfabric.legacy-fabric-api:legacy-fabric-api:1.9.1+1.8.9")
	modImplementation("net.fabricmc:fabric-language-kotlin:1.10.17+kotlin.1.9.22")
}

tasks.compileJava {
	options.release.set(jvmVer)
}

kotlin {
	jvmToolchain(jvmVer)
}