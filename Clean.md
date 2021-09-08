Recent places
prefetch
C:\Windows\SoftwareDistribution\Download
temp
%temp%
Open PowerShell
    Get-AppxPackage | where-object {$_.name –notlike "store"} | Remove-AppxPackage