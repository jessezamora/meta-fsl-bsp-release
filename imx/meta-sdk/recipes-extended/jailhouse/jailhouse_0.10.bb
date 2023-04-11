require jailhouse.inc

SRCBRANCH = "imx_4.19.35_1.1.0"
IMX_JAILHOUSE_SRC ?= "git://github.com/nxp-imx/imx-jailhouse.git;protocol=https"

SRC_URI = "${IMX_JAILHOUSE_SRC};branch=${SRCBRANCH} \
        file://0001-multilib-Fix-hardcoded-lib-in-firmwaredir.patch \
"
SRCREV = "e83ab629ccc6f44e4caa05bc51c66d2f86546ee6" 

CELLS = ""

COMPATIBLE_MACHINE = "${@bb.utils.contains('MACHINE_FEATURES', 'jailhouse', '${MACHINE}', '(^$)', d)}"
