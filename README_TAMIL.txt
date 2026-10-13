Route Order Alert — GitHub Build Package

முக்கிய குறிப்பு:
இந்த ZIP-இல் உள்ள Android app இன்னும் ஆரம்ப prototype மட்டுமே. இதை build செய்தால் install செய்யக்கூடிய debug APK உருவாகலாம்; ஆனால் Swiggy / Ek Bharat ஆர்டர்களை route-உடன் ஒப்பிட்டு தானாக alert கொடுக்கும் வசதி இன்னும் எழுதப்படவில்லை.

GitHub-ல் பயன்படுத்த:
1. ZIP-ஐ உங்கள் போனில் extract செய்யவும்.
2. GitHub repository-யின் main பக்கத்தில் Add file → Upload files தேர்வு செய்யவும்.
3. ZIP கோப்பை மட்டும் அல்ல; extract செய்தபின் உள்ள எல்லா கோப்புகள்/கோப்புறைகளையும் repository root-க்கு upload செய்ய வேண்டும். குறிப்பாக .github/workflows/build.yml, app/, build.gradle, settings.gradle, gradle.properties.
4. Commit changes செய்யவும்.
5. Actions tab → Build debug APK → Run workflow.
6. Build வெற்றி பெற்றால் workflow run-ஐ திறந்து Artifacts பகுதியில் RouteOrderAlert-debug-apk ZIP-ஐ download செய்யவும். அதற்குள் app-debug.apk இருக்கும்.

குறிப்பு: GitHub repository-க்கு இந்த ZIP-ஐ மட்டும் upload செய்தால் build நடக்காது. Source files root-ல் இருக்க வேண்டும்.
