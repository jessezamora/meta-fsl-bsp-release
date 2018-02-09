# Copyright 2017 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "026a8661c38757cc153d7620b22638d6"
SRC_URI[sha256sum] = "d79bcf5fe76107bb8ea28c9f80810c757d18b84960107a6926fbe26d819e74f9"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
