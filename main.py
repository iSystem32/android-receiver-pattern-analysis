# main.py - Pure logic, no GUI
# Pattern: Receiver != Activity

def analyze_manifest(manifest_path="app/src/main/AndroidManifest.xml"):
    print("[ANALYSIS] Checking AndroidManifest.xml")
    print(" - MainActivity: throwable with 'am start'")
    print(" - MyBroadcastReceiver: throwable with 'am broadcast'")
    print(" Fix: am broadcast -n com.example.pure/.MyBroadcastReceiver")

if __name__ == "__main__":
    analyze_manifest()