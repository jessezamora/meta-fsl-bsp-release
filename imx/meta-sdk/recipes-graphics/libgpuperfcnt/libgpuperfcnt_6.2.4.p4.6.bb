DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3"

SRC_URI[arm-fb.md5sum] = "fb98ba4d75e3e2bb7e1a57c3ccc8e123"
SRC_URI[arm-fb.sha256sum] = "368d30cf33ad0d3d2e8a4c55716941a5bb9c198b3068da30dbd75086181925ce"

SRC_URI[arm-wayland.md5sum] = "506d931305dffde65603b096ab2dea74"
SRC_URI[arm-wayland.sha256sum] = "70211b13fb10af34da74ee7b4f9c4ae3a06f1b2d815b405be617eee1d6da0de0"

SRC_URI[arm-x11.md5sum] = "e3ed4cdb6fd57e0713f3788916925503"
SRC_URI[arm-x11.sha256sum] = "ad85b37c49543c9fbb1f24f1d6914fd6a8fc650d0cebdb352a1968fa7a91125f"

SRC_URI[aarch64-fb.md5sum] = "c2e13e3f6706f137b247c7a3560ceb8a"
SRC_URI[aarch64-fb.sha256sum] = "7123d0fd6c65adc45cd0e88eee449ff2844228cb842396b698b1d5177af20301"

SRC_URI[aarch64-wayland.md5sum] = "8d7dc5dfe2059e02c6178e8b3ed3ec16"
SRC_URI[aarch64-wayland.sha256sum] = "7675040ae4d6c39e7606cfe5e124f9b8ea5e09c44293341a3a4e50f9c46e7e6e"

SRC_URI[aarch64-x11.md5sum] = "1c63dffdb5e00808c7cae992a6ffcade"
SRC_URI[aarch64-x11.sha256sum] = "5388e01c70d0775c9df5534fde53d08902609a1371c802124d0a4bfe175cfbaf"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
