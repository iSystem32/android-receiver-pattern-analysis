# android-receiver-pattern-analysis

## Error
Activity class {com.example.pure/MyBroadcastReceiver} does not exist

## Causa
`am start` solo lanza Activity, no Receiver.

## Fix
`am broadcast -n com.example.pure/.MyBroadcastReceiver -a android.intent.action.BOOT_COMPLETED`

## Estructura
- index.html = doc web universal
- AndroidManifest.xml = archivo real que entiende Android
