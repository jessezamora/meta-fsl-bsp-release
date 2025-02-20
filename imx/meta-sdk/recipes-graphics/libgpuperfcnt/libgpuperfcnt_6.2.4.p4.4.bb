DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

SRC_URI[arm-fb.md5sum] = "36b0692236a6055e5b1ba57fc3651e54"
SRC_URI[arm-fb.sha256sum] = "be5171cb2c7b45413cf7c3cd50ab7bbd16b7cc7c81440a4cfadecc9c9ddfeb61"

SRC_URI[arm-wayland.md5sum] = "4530b422c69a14c2a9aa3837ed3d382a"
SRC_URI[arm-wayland.sha256sum] = "ce650267a0fc47a099273beb644f54c1def0e5f7467ab3ec9fe88907c44826ee"

SRC_URI[arm-x11.md5sum] = "3cfcfa4647f268136a713e9ae910a5eb"
SRC_URI[arm-x11.sha256sum] = "8ba12def2803dcef7c7a435a99bb701584a5d92b4b66c4ff5487815fda730319"

SRC_URI[aarch64-fb.md5sum] = "c2e13e3f6706f137b247c7a3560ceb8a"
SRC_URI[aarch64-fb.sha256sum] = "7123d0fd6c65adc45cd0e88eee449ff2844228cb842396b698b1d5177af20301"

SRC_URI[aarch64-wayland.md5sum] = "8d7dc5dfe2059e02c6178e8b3ed3ec16"
SRC_URI[aarch64-wayland.sha256sum] = "7675040ae4d6c39e7606cfe5e124f9b8ea5e09c44293341a3a4e50f9c46e7e6e"

SRC_URI[aarch64-x11.md5sum] = "f5eb0b56606ae76e306afd8455629a88"
SRC_URI[aarch64-x11.sha256sum] = "600e774079556910afb8c5036799aa1b55b0e559496e5e64073080175703d58b"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
